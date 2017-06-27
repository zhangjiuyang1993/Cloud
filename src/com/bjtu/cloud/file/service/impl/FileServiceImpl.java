package com.bjtu.cloud.file.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjtu.cloud.file.dao.FileDao;
import com.bjtu.cloud.file.entity.File;
import com.bjtu.cloud.file.entity.FileExample;
import com.bjtu.cloud.file.entity.FileExample.Criteria;
import com.bjtu.cloud.file.entity.FileExt;
import com.bjtu.cloud.file.service.FileService;
import com.bjtu.cloud.user.dao.UserDao;
@Service
public class FileServiceImpl implements FileService{

	@Autowired
	private FileDao fileDao;
	
	//获取所有的文件列表
	public List<FileExt> findFileList(FileExt fileExt) {
		List<FileExt> list = fileDao.findFileAndUser(fileExt);
		return list;
	}
	
	//根据userid获取文件列表
	public List<File> findFileListByUserId(Integer userid){
		FileExample example = new FileExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<File> list = fileDao.selectByExample(example);
		return list;
	}

	//根据姓名模糊查询文件列表
	public List<FileExt> findFileListByName(String fname) {
		if(fname.equals("") || fname == null){
			return null;
		}
		FileExt fileExt = new FileExt();
		fileExt.setFname(fname);
		List<FileExt> list = fileDao.findFileAndUser(fileExt);
		return list;
	}

	//根据fid删除单个文件
	public void delete(Integer fid) {
		fileDao.deleteByPrimaryKey(fid);
	}
	
	public List<File> findFileListByNameAndUserId(String fname,Integer userid){
		if(fname.equals("") || fname == null){
			return null;
		}
		FileExample example = new FileExample();
		Criteria criteria = example.createCriteria();
		criteria.andFnameLike("%"+fname+"%");
		criteria.andUseridEqualTo(userid);
		List<File> list = fileDao.selectByExample(example );
		return list;
		
	}
	
}
