package com.bjtu.cloud.user.entity;

import java.util.List;

import com.bjtu.cloud.docker.entity.Docker;
import com.bjtu.cloud.file.entity.File;

public class UserExt extends User{

	private List<Docker> dockerList;
	
	private List<File> fileList;

	public List<Docker> getDockerList() {
		return dockerList;
	}

	public void setDockerList(List<Docker> dockerList) {
		this.dockerList = dockerList;
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}
	
	
	
}
