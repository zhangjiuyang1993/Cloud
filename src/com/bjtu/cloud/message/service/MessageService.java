package com.bjtu.cloud.message.service;

import java.util.List;

import com.bjtu.cloud.message.entity.Message;

public interface MessageService {

	List<Message> findMessageList();
	
	List<Message> findMessageListByContent(String content);
}
