package com.bjtu.cloud.process.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bjtu.cloud.process.entity.Process;
import com.bjtu.cloud.process.entity.ProcessExample;
import com.bjtu.cloud.process.entity.ProcessExt;

public interface ProcessDao {
    int countByExample(ProcessExample example);

    int deleteByExample(ProcessExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Process record);

    int insertSelective(Process record);

    List<Process> selectByExample(ProcessExample example);

    Process selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Process record, @Param("example") ProcessExample example);

    int updateByExample(@Param("record") Process record, @Param("example") ProcessExample example);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);
    
    List<ProcessExt> findProcessAndDockerRstMap(ProcessExt processExt);
}