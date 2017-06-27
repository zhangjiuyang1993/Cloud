package com.bjtu.cloud.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjtu.cloud.message.dao.MessageDao;
import com.bjtu.cloud.message.entity.Message;
import com.bjtu.cloud.message.entity.MessageExample;
import com.bjtu.cloud.message.entity.MessageExample.Criteria;
import com.bjtu.cloud.message.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;
	
	//获取全部message
	public List<Message> findMessageList() {
		MessageExample example = new MessageExample();
		List<Message> list = messageDao.selectByExample(example);
		return list;
	}

	//根据content返回message列表
	public List<Message> findMessageListByContent(String content) {
		if(content == null || content.equals(""))
			return null;
		MessageExample example = new MessageExample();
		Criteria criteria = example.createCriteria();
		criteria.andContentLike("%"+content+"%");
		List<Message> list = messageDao.selectByExample(example );
		return list;
	}

}
