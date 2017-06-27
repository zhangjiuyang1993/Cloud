package com.bjtu.cloud.file.dao;

import com.bjtu.cloud.file.entity.File;
import com.bjtu.cloud.file.entity.FileExample;
import com.bjtu.cloud.file.entity.FileExt;
import com.bjtu.cloud.user.entity.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileDao {
    int countByExample(FileExample example);

    int deleteByExample(FileExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(File record);

    int insertSelective(File record);

    List<File> selectByExample(FileExample example);

    File selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") File record, @Param("example") FileExample example);

    int updateByExample(@Param("record") File record, @Param("example") FileExample example);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
    
    List<FileExt> findFileAndUser(FileExt fileExt);
    
}