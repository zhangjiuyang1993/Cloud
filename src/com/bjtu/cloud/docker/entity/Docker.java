package com.bjtu.cloud.docker.entity;

public class Docker {
    private Integer dockerid;

    private String dockername;

    private String dockernumber;

    private Integer uid;

    private String ipaddress;

    public Integer getDockerid() {
        return dockerid;
    }

    public void setDockerid(Integer dockerid) {
        this.dockerid = dockerid;
    }

    public String getDockername() {
        return dockername;
    }

    public void setDockername(String dockername) {
        this.dockername = dockername == null ? null : dockername.trim();
    }

    public String getDockernumber() {
        return dockernumber;
    }

    public void setDockernumber(String dockernumber) {
        this.dockernumber = dockernumber == null ? null : dockernumber.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }
}