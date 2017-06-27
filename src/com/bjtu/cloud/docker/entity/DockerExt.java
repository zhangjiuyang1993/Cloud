package com.bjtu.cloud.docker.entity;

import java.util.List;

import com.bjtu.cloud.user.entity.User;

public class DockerExt extends Docker{

	private User user;

	private List<Process> processList;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Process> getProcessList() {
		return processList;
	}

	public void setProcessList(List<Process> processList) {
		this.processList = processList;
	}
	
	
	
}
