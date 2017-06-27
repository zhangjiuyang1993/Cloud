package com.bjtu.cloud.file.entity;

import com.bjtu.cloud.user.entity.User;

public class FileExt extends File{

	private String username;
	
	private User user;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
