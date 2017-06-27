package com.bjtu.cloud.docker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjtu.cloud.docker.dao.DockerDao;
import com.bjtu.cloud.docker.entity.Docker;
import com.bjtu.cloud.docker.entity.DockerExample;
import com.bjtu.cloud.docker.entity.DockerExample.Criteria;
import com.bjtu.cloud.docker.entity.DockerExt;
import com.bjtu.cloud.docker.service.DockerService;
@Service
public class DockerServiceImpl implements DockerService{

	@Autowired
	private DockerDao dockerDao;
	
	//获取全部docker列表
	public List<DockerExt> findDockerList(DockerExt dockerExt) {
		List<DockerExt> list = dockerDao.findDockerAndUserRstMap(dockerExt);
		return list;
	}

	//根据dockerid获取docker
	public DockerExt findDockerById(Integer dockerid) {
		DockerExt dockerExt = new DockerExt();
		dockerExt.setDockerid(dockerid);
		List<DockerExt> list = dockerDao.findDockerAndUserRstMap(dockerExt);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	//根据userid获取docker列表
	public List<Docker> findDockerListByUserId(Integer userid) {
		DockerExample example = new DockerExample();
		Criteria criteria = example.createCriteria();
		criteria.andUidEqualTo(userid);
		List<Docker> list = dockerDao.selectByExample(example);
		return list;
	}
	
	//根据dockerid和userid获取docker列表
	public List<Docker> findDockerListByIdAndUserId(Integer dockerid , Integer userid){
		if(dockerid == null){
			return null;
		}
		DockerExample example = new DockerExample();
		Criteria criteria = example.createCriteria();
		criteria.andUidEqualTo(userid);
		criteria.andDockeridEqualTo(dockerid);
		List<Docker> list = dockerDao.selectByExample(example);
		return list;
	}


}
