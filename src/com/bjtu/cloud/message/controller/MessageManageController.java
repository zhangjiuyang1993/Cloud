package com.bjtu.cloud.message.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.message.entity.Message;
import com.bjtu.cloud.message.service.MessageService;

@Controller
@RequestMapping("messageManage")
public class MessageManageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("list")
	public String list(Model model){
		List<Message> list = messageService.findMessageList();
		model.addAttribute("messageList", list);
		return "admin/message/list";
	}
	
	@RequestMapping("findByName")
	public String findByName(String content,Model model){
		List<Message> list = messageService.findMessageListByContent(content);
		model.addAttribute("content", content);
		model.addAttribute("messageList", list);
		return "admin/message/list";
		
	}
	
}
