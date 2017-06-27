package com.bjtu.cloud.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.cloud.user.entity.User;
import com.bjtu.cloud.user.service.UserService;
import com.bjtu.cloud.utils.MD5;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("userManage")
public class UserManageController {

	@Autowired
	private UserService userService;
	
	//用户管理-显示所有用户
	/*@RequestMapping("list")
	public String list(Model model){
		List<User> list = userService.findUserList();
		model.addAttribute("userList",list);
		return "admin/user/list";
	}*/
	
	//用户管理-显示"模糊查询"的用户
	@RequestMapping("findByName")
	public String findByName(String username,Model model){
		List<User> list = userService.findUserListByName(username);
		model.addAttribute("userList", list);
		model.addAttribute("username", username);
		return "/admin/user/list";
	}
	
	//用户管理-转到"添加用户"页面
	@RequestMapping("addPage")
	public String addPage(){
		return "admin/user/add";
	}
	
	//用户管理-添加-添加用户
	@RequestMapping("addUser")
	public String addUser(User user){
		String password = MD5.getMD5Value(user.getPassword());
		user.setPassword(password);
		userService.addUser(user);
		return "redirect:list";
	}
	
	//用户管理-操作-"更新用户-启用-禁用"
	@RequestMapping("edit")
	public String edit(Integer userid){
		User user = userService.findUserById(userid);
		if(user.getState() == 0){
			user.setState(1);
		}else{
			user.setState(0);
		}
		userService.updateUser(user);
		return "redirect:list";
	}
	
	@RequestMapping("list")
    public ModelAndView showCityList(ModelAndView mv,
            @RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="3") Integer pageSize){
		//page = page==0?1:page;
        PageHelper.startPage(page, pageSize);
        List<User> list = userService.findUserList();
        PageInfo<User> p=new PageInfo<User>(list);
        mv.addObject("userList", list);
        mv.addObject("page", p);
        mv.setViewName("admin/user/list");
        return mv;
    }
	
}
