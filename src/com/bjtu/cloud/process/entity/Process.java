package com.bjtu.cloud.process.entity;

public class Process {
    private Integer pid;

    private String pname;

    private Integer state;

    private Integer dockerid;

    private Double cpuPercent;

    private String memoryUsed;

    private Double memoryPercent;

    private String diskUsed;

    private Double diskPercent;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDockerid() {
        return dockerid;
    }

    public void setDockerid(Integer dockerid) {
        this.dockerid = dockerid;
    }

    public Double getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Double cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public String getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(String memoryUsed) {
        this.memoryUsed = memoryUsed == null ? null : memoryUsed.trim();
    }

    public Double getMemoryPercent() {
        return memoryPercent;
    }

    public void setMemoryPercent(Double memoryPercent) {
        this.memoryPercent = memoryPercent;
    }

    public String getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(String diskUsed) {
        this.diskUsed = diskUsed == null ? null : diskUsed.trim();
    }

    public Double getDiskPercent() {
        return diskPercent;
    }

    public void setDiskPercent(Double diskPercent) {
        this.diskPercent = diskPercent;
    }
}