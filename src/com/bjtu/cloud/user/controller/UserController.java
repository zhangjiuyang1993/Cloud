package com.bjtu.cloud.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.user.entity.User;
import com.bjtu.cloud.user.service.UserService;
import com.bjtu.cloud.utils.MD5;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("personal")
	public String personal(Integer userid,Model model){
		User user = userService.findUserById(userid);
		model.addAttribute("user", user);
		return "common/user/personal";
	}
	
	@RequestMapping("editPage")
	public String edit(Integer userid,Model model){
		User user = userService.findUserById(userid);
		model.addAttribute("user", user);
		model.addAttribute("userid", userid);
		return "common/user/edit";
	}
	
	@RequestMapping("edit")
	public String edit(User user,Integer userid,Model model){
		user.setUserid(userid);
		userService.updateUser(user);
		model.addAttribute("userid", userid);
		return "common/user/personal";
	}
	
	@RequestMapping("passwordPage")
	public String password(Integer userid,Model model){
		User user = userService.findUserById(userid);
		model.addAttribute("user", user);
		model.addAttribute("userid", userid);
		return "common/user/password";
	}
	
	@RequestMapping("password")
	public String password(String password,String newpassword1,Integer userid,Model model){
		User user = userService.findUserById(userid);
		if(MD5.getMD5Value(password).equals(user.getPassword())){
			User u = new User();
			u.setUserid(user.getUserid());
			u.setPassword(MD5.getMD5Value(newpassword1));
			userService.updateUser(u);
			return "admin/login";
		}else{
			model.addAttribute("error", "当前密码不正确!");
			model.addAttribute("user", user);
			model.addAttribute("userid", userid);
			return "common/user/password";
		}
		
	}
	
	
}
