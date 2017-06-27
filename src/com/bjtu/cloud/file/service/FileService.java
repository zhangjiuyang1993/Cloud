package com.bjtu.cloud.file.service;

import java.util.List;

import com.bjtu.cloud.file.entity.File;
import com.bjtu.cloud.file.entity.FileExt;

public interface FileService {

	List<FileExt> findFileList(FileExt fileExt);
	
	List<File> findFileListByUserId(Integer userid);
	
	List<FileExt> findFileListByName(String fname);
	
	List<File> findFileListByNameAndUserId(String fname,Integer userid);
	
	void delete(Integer fid);
}
