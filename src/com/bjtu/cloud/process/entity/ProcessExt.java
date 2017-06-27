package com.bjtu.cloud.process.entity;

import com.bjtu.cloud.docker.entity.DockerExt;

public class ProcessExt extends Process{

	private DockerExt dockerExt;

	public DockerExt getDockerExt() {
		return dockerExt;
	}

	public void setDockerExt(DockerExt dockerExt) {
		this.dockerExt = dockerExt;
	}

	
}
