package com.bjtu.cloud.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.user.entity.User;
import com.bjtu.cloud.user.service.UserService;

@Controller
public class UserAdminController {

	@Autowired
	private UserService userService;
	
	//跳转登录界面
	@RequestMapping("")
	public String loginPage(){
		return "admin/login";
	}
	
	//验证登录
	@RequestMapping("login")
	public String login(User user,HttpSession session,Model model){
		User u = userService.login(user);
		if(u != null){
			session.setAttribute("user", u);
			if(u.getRole()==0){
				return "admin/home";
			}else{
				model.addAttribute("userid", u.getUserid());
				return "common/home";
			}
		}else{
			model.addAttribute("error","登录账号或者密码错误！！！");
			return "admin/login";
		}
	}
	
	//登录注销
	@RequestMapping("logout")
	public String logout(HttpSession session,HttpServletRequest request){
		session = request.getSession();
		session.invalidate();
		return "admin/login";
	}
	
}
