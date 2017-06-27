package com.bjtu.cloud.process.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.docker.entity.DockerExt;
import com.bjtu.cloud.docker.service.DockerService;
import com.bjtu.cloud.process.entity.Process;
import com.bjtu.cloud.process.entity.ProcessExt;
import com.bjtu.cloud.process.service.ProcessService;

@Controller
@RequestMapping("processManage")
public class processManageController {
	
	@Autowired
	private ProcessService processService;
	
	@Autowired
	private DockerService dockerService;
	
	//进程管理-显示所有的进程
	@RequestMapping("list")
	public String list(Model model){
		List<ProcessExt> list = processService.findProcessList(new ProcessExt());
		model.addAttribute("processList", list);
		return "admin/process/list";
	}
	
	//进程管理-查询
	@RequestMapping("findByName")
	public String findByName(String pname,Model model){
		List<ProcessExt> list = processService.findProcessListByName(pname);
		model.addAttribute("processList", list);
		model.addAttribute("processname", pname);
		return "admin/process/list";
	}
	
	//docker管理-进入
	@RequestMapping("findProcessByDockerId")
	public String findProcessByDockerId(Integer dockerid,Model model){
		List<Process> list = processService.findProcessListByDockerId(dockerid);
		Integer uid = dockerService.findDockerById(dockerid).getUid();
		model.addAttribute("processList", list);
		model.addAttribute("dockerid", dockerid);
		model.addAttribute("userid", uid);
		return "admin/process/processByDocker";
	}
	
	//进程管理-根据name和dockerid查询
	@RequestMapping("findByNameAndDockerId")
	public String findByNameAndDockerId(String pname,Integer dockerid,Model model){
		List<Process> list = processService.findProcessListByNameAndDockerId(pname, dockerid);
		model.addAttribute("processList", list);
		model.addAttribute("dockerid", dockerid);
		model.addAttribute("processname", pname);
		Integer uid = dockerService.findDockerById(dockerid).getUid();
		model.addAttribute("userid", uid);
		return "admin/process/processByDocker";
	}
	
}
