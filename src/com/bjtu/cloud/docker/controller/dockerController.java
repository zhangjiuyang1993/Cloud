package com.bjtu.cloud.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.docker.entity.Docker;
import com.bjtu.cloud.docker.service.DockerService;
import com.bjtu.cloud.process.service.ProcessService;
import com.bjtu.cloud.user.service.UserService;
@Controller
@RequestMapping("docker")
public class dockerController {
	
	@Autowired
	private DockerService dockerService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public String list(Integer userid,Model model){
		List<Docker> list = dockerService.findDockerListByUserId(userid);
		model.addAttribute("dockerList", list);
		model.addAttribute("userid", userid);
		return "common/docker/docker";
	}
	
	@RequestMapping("dockerListById")
	public String dockerListById(Integer dockerid, Integer userid,Model model){
		List<Docker> list = dockerService.findDockerListByIdAndUserId(dockerid, userid);
		model.addAttribute("dockerList", list);
		model.addAttribute("userid", userid);
		return "common/docker/docker";
	}
	
	@RequestMapping("requestPage")
	public String requestPage(Integer userid,Model model){
		model.addAttribute("userid", userid);
		return "common/docker/request_docker";
	}
	
}
