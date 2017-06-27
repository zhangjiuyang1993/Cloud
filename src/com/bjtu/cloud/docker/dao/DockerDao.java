package com.bjtu.cloud.docker.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bjtu.cloud.docker.entity.Docker;
import com.bjtu.cloud.docker.entity.DockerExample;
import com.bjtu.cloud.docker.entity.DockerExt;

public interface DockerDao {
    int countByExample(DockerExample example);

    int deleteByExample(DockerExample example);

    int deleteByPrimaryKey(Integer dockerid);

    int insert(Docker record);

    int insertSelective(Docker record);

    List<Docker> selectByExample(DockerExample example);

    Docker selectByPrimaryKey(Integer dockerid);

    int updateByExampleSelective(@Param("record") Docker record, @Param("example") DockerExample example);

    int updateByExample(@Param("record") Docker record, @Param("example") DockerExample example);

    int updateByPrimaryKeySelective(Docker record);

    int updateByPrimaryKey(Docker record);
    
    List<DockerExt> findDockerAndUserRstMap(DockerExt dockerExt); 
    
    List<DockerExt> findDockerAndProcessRstMap(DockerExt dockerExt);
}