package com.bjtu.cloud.process.service;

import java.util.List;
import com.bjtu.cloud.process.entity.Process;
import com.bjtu.cloud.process.entity.ProcessExt;

public interface ProcessService {

	List<ProcessExt> findProcessList(ProcessExt processExt);

	List<ProcessExt> findProcessListByName(String pname);
	
	List<Process> findProcessListByNameAndDockerId(String pname,Integer dockerid);
	
	List<Process> findProcessListByDockerId(Integer dockerid);
	
	List<ProcessExt> findProcessListByUserId(Integer userid);
	
	List<ProcessExt> findProcessListByNameAndUserId(String pname,Integer userid);
	
	List<ProcessExt> findProcessExtListByDockerId(Integer dockerid);
}
