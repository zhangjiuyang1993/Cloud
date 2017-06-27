package com.bjtu.cloud.process.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjtu.cloud.docker.entity.DockerExt;
import com.bjtu.cloud.process.dao.ProcessDao;
import com.bjtu.cloud.process.entity.Process;
import com.bjtu.cloud.process.entity.ProcessExample;
import com.bjtu.cloud.process.entity.ProcessExample.Criteria;
import com.bjtu.cloud.process.entity.ProcessExt;
import com.bjtu.cloud.process.service.ProcessService;
import com.bjtu.cloud.user.entity.User;

@Service
public class ProcessServiceImpl implements ProcessService {

	@Autowired
	private ProcessDao processDao;

	// 获取所有的process列表
	public List<ProcessExt> findProcessList(ProcessExt processExt) {
		List<ProcessExt> list = processDao.findProcessAndDockerRstMap(processExt);
		return list;
	}

	// 根据userid查询process列表
	public List<ProcessExt> findProcessListByUserId(Integer userid) {
		ProcessExt processExt = new ProcessExt();
		DockerExt dockerExt = new DockerExt();
		User user = new User();
		user.setUserid(userid);
		dockerExt.setUser(user);
		processExt.setDockerExt(dockerExt);
		List<ProcessExt> list = processDao.findProcessAndDockerRstMap(processExt);
		return list;
	}

	// 根据dockerid查询process列表
	public List<ProcessExt> findProcessExtListByDockerId(Integer dockerid) {
		ProcessExt processExt = new ProcessExt();
		processExt.setDockerid(dockerid);
		List<ProcessExt> list = processDao.findProcessAndDockerRstMap(processExt);
		return list;
	}

	// 根据userid和name查询process列表
	public List<ProcessExt> findProcessListByNameAndUserId(String pname, Integer userid) {
		if (pname == null || pname.equals("")) {
			return null;
		}
		ProcessExt processExt = new ProcessExt();
		processExt.setPname(pname);
		DockerExt dockerExt = new DockerExt();
		User user = new User();
		user.setUserid(userid);
		dockerExt.setUser(user);
		processExt.setDockerExt(dockerExt);
		List<ProcessExt> list = processDao.findProcessAndDockerRstMap(processExt);
		return list;
	}

	// 根据pname模糊查询获取process列表
	public List<ProcessExt> findProcessListByName(String pname) {
		if (pname == null || pname.equals(""))
			return null;
		ProcessExt processExt = new ProcessExt();
		processExt.setPname(pname);
		List<ProcessExt> list = processDao.findProcessAndDockerRstMap(processExt);
		return list;
	}

	// 根据pname和dockerid模糊查询获取process列表
	public List<Process> findProcessListByNameAndDockerId(String pname, Integer dockerid) {
		if (pname == null || pname.equals(""))
			return null;
		ProcessExample example = new ProcessExample();
		Criteria criteria = example.createCriteria();
		criteria.andPnameLike("%" + pname + "%");
		criteria.andDockeridEqualTo(dockerid);
		List<Process> list = processDao.selectByExample(example);
		return list;
	}

	// 根据dockerid查找process列表
	public List<Process> findProcessListByDockerId(Integer dockerid) {
		ProcessExample example = new ProcessExample();
		Criteria criteria = example.createCriteria();
		criteria.andDockeridEqualTo(dockerid);
		List<Process> list = processDao.selectByExample(example);
		return list;
	}

}
