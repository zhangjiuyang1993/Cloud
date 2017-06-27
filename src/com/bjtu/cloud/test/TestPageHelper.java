package com.bjtu.cloud.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjtu.cloud.user.dao.UserDao;
import com.bjtu.cloud.user.entity.User;
import com.bjtu.cloud.user.entity.UserExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class TestPageHelper {

	@Test
	public void testPageHelper() throws Exception {
		// 1、获得mapper代理对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		UserDao userDao = applicationContext.getBean(UserDao.class);
		// 2、设置分页
		PageHelper.startPage(1, 3);
		// 3、执行查询
		UserExample example = new UserExample();
		List<User> list = userDao.selectByExample(example);
		// 4、取分页后结果
		PageInfo<User> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		System.out.println("total:" + total);
		int pages = pageInfo.getPages();
		System.out.println("pages:" + pages);
		int pageSize = pageInfo.getPageSize();
		System.out.println("pageSize:" + pageSize);

	}

}