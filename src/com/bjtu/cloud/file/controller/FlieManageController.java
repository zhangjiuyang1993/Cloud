package com.bjtu.cloud.file.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.docker.entity.DockerExt;
import com.bjtu.cloud.file.entity.File;
import com.bjtu.cloud.file.entity.FileExt;
import com.bjtu.cloud.file.service.FileService;
import com.bjtu.cloud.process.entity.ProcessExt;
import com.bjtu.cloud.user.entity.User;
import com.bjtu.cloud.user.service.UserService;

@Controller
@RequestMapping("fileManage")
public class FlieManageController {

	@Autowired
	private FileService fileService;

	@Autowired
	private UserService userService;

	//文件管理-显示所有文件列表
	@RequestMapping("list")
	public String list(Model model) {
		List<FileExt> list = fileService.findFileList(new FileExt());
		model.addAttribute("fileList", list);
		return "admin/file/list";
	}

	//用户管理-查看用户文件
	@RequestMapping("fileListByUserId")
	public String fileListByUserId(Integer userid, Model model) {
		User user = userService.findUserById(userid);
		List<File> list = fileService.findFileListByUserId(userid);
		String username = user.getUsername();
		model.addAttribute("userid", userid);
		model.addAttribute("username", username);
		model.addAttribute("fileList", list);
		return "admin/file/fileByUser";

	}
	
	//文件管理-根据文件名查询文件列表
	@RequestMapping("findByName")
	public String findByName(String fname, Model model) {
		List<FileExt> list = fileService.findFileListByName(fname);
		model.addAttribute("fileList", list);
		model.addAttribute("fname", fname);
		return "admin/file/list";
	}

	//文件管理-根据文件名和userid查询
	@RequestMapping("fileListByNameAndUserId")
	public String fileListByNameAndUserId(String fname, Integer userid, Model model) {
		List<File> list = fileService.findFileListByNameAndUserId(fname, userid);
		String username = userService.findUserById(userid).getUsername();
		model.addAttribute("fileList", list);
		model.addAttribute("userid", userid);
		model.addAttribute("username", username);
		model.addAttribute("fname", fname);
		return "admin/file/fileByUser";
	}
	
	//文件管理-删除
	@RequestMapping("deleteById")
	public String deleteById(Integer fid){
		fileService.delete(fid);
		return "redirect:list";
	}
	
	//文件管理-删除根据fid和userid
	@RequestMapping("deleteByIdAndUserId")
	public String deleteByIdAndUserId(Integer fid,Integer userid,Model model){
		//TODO  这里的代码重复,需要重新设计
		fileService.delete(fid);
		User user = userService.findUserById(userid);
		List<File> list = fileService.findFileListByUserId(userid);
		String username = user.getUsername();
		model.addAttribute("userid", userid);
		model.addAttribute("username", username);
		model.addAttribute("fileList", list);
		return "admin/file/fileByUser";
	}
	
}
