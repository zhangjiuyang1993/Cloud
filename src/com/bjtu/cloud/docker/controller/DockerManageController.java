package com.bjtu.cloud.docker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.docker.entity.Docker;
import com.bjtu.cloud.docker.entity.DockerExt;
import com.bjtu.cloud.docker.service.DockerService;
import com.bjtu.cloud.user.service.UserService;

@Controller
@RequestMapping("dockerManage")
public class DockerManageController {
	
	@Autowired
	private DockerService dockerService;
	
	@Autowired
	private UserService userService;
	
	//用户管理-查看docker列表
	@RequestMapping("dockerListByUserId")
	public String dockerListByUserId(Integer userid,Model model){
		List<Docker> list = dockerService.findDockerListByUserId(userid);
		model.addAttribute("dockerList", list);
		model.addAttribute("userid", userid);
		String username = userService.findUserById(userid).getUsername();
		model.addAttribute("username", username);
		return "admin/docker/listByUser";
	}
	
	//docker管理-显示所有docker
	@RequestMapping("list")
	public String list(Model model){
		List<DockerExt> list = dockerService.findDockerList(new DockerExt());
		model.addAttribute("dockerList", list);
		return "admin/docker/list";
	}
	
	//docker管理-"根据dockerid和userid查询docker"
	@RequestMapping("dockerListByNameAndUserId")
	public String dockerListByNameAndUserId(Integer dockerid,Integer userid,Model model){
		List<Docker> list = dockerService.findDockerListByIdAndUserId(dockerid, userid);
		model.addAttribute("dockerList",list);
		model.addAttribute("userid", userid);
		model.addAttribute("dockerid", dockerid);
		String username = userService.findUserById(userid).getUsername();
		model.addAttribute("username", username);
		return "admin/docker/listByUser";
		
	}
	
	//docker管理-根据dockerid查询
	@RequestMapping("dockerListById")
	public String dockerListById(Integer dockerid,Model model){
		List<DockerExt> list = new ArrayList<DockerExt>();
		DockerExt dockerExt = dockerService.findDockerById(dockerid);
		list.add(dockerExt);
		model.addAttribute("dockerList", list);
		model.addAttribute("dockerid", dockerid);
		return "admin/docker/list";
	}
	
}
