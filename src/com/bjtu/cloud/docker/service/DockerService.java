package com.bjtu.cloud.docker.service;

import java.util.List;

import com.bjtu.cloud.docker.entity.Docker;
import com.bjtu.cloud.docker.entity.DockerExt;

public interface DockerService {

	List<DockerExt> findDockerList(DockerExt dockerExt);
	
	DockerExt findDockerById(Integer dockerid);
	
	List<Docker> findDockerListByUserId(Integer userid);
	
	List<Docker> findDockerListByIdAndUserId(Integer dockerid , Integer userid);
}
