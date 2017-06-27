package com.bjtu.cloud.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjtu.cloud.user.dao.UserDao;
import com.bjtu.cloud.user.entity.User;
import com.bjtu.cloud.user.entity.UserExample;
import com.bjtu.cloud.user.entity.UserExample.Criteria;
import com.bjtu.cloud.user.service.UserService;
import com.bjtu.cloud.utils.MD5;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	//用户登录
	public User login(User user) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(user.getUserid());
		String password = MD5.getMD5Value(user.getPassword());
		criteria.andPasswordEqualTo(password);
		List<User> list = userDao.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	//获取全部user列表
	public List<User> findUserList() {
		UserExample example = new UserExample();
		List<User> list = userDao.selectByExample(example);
		return list;
	}
	

	//根据用户姓名模糊查询
	public List<User> findUserListByName(String username) {
		if(username.equals("") || username == null)
			return null;
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameLike("%"+username+"%");
		List<User> list = userDao.selectByExample(example);
		return list;
	}

	//添加用户
	public void addUser(User user) {
		userDao.insert(user);
	}

	//更新用户
	public void updateUser(User user) {
		userDao.updateByPrimaryKeySelective(user);
	}

	//根据用户id进行查询用户
	public User findUserById(Integer userid) {
		User user = userDao.selectByPrimaryKey(userid);
		return user;
	}
	
}
