package com.bjtu.cloud.message.dao;

import com.bjtu.cloud.message.entity.Message;
import com.bjtu.cloud.message.entity.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageDao {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}