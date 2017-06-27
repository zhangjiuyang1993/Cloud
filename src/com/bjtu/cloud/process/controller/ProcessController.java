package com.bjtu.cloud.process.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.process.entity.Process;
import com.bjtu.cloud.process.entity.ProcessExt;
import com.bjtu.cloud.process.service.ProcessService;

@Controller
@RequestMapping("process")
public class ProcessController {

	@Autowired
	private ProcessService processService;

	@RequestMapping("list")
	public String list(Integer userid, Model model) {
		ProcessExt processExt = new ProcessExt();
		List<ProcessExt> list = processService.findProcessListByUserId(userid);
		model.addAttribute("processList", list);
		model.addAttribute("userid", userid);
		return "common/process/process";
	}
	
	@RequestMapping("findByName")
	public String findByName(String pname,Integer userid,Model model){
		List<ProcessExt> list = processService.findProcessListByNameAndUserId(pname, userid);
		model.addAttribute("userid",userid);
		model.addAttribute("pname", pname);
		model.addAttribute("processList", list);
		return "common/process/process";
	}
	
	@RequestMapping("performance")
	public String performance(Integer userid,Model model){
		model.addAttribute("userid", userid);
		return "common/process/performance";
	}
	
	@RequestMapping("processByDocker")
	public String processByDocker(Integer userid,Integer dockerid,Model model){
		List<ProcessExt> list = processService.findProcessExtListByDockerId(dockerid);
		model.addAttribute("userid", userid);
		model.addAttribute("dockerid", dockerid);
		model.addAttribute("processList", list);
		return "common/process/process";
	}

}
