package com.bjtu.cloud.message.entity;

import java.util.Date;

public class Message {
    private Integer mid;

    private String content;

    private Integer messageUserid;

    private Date time;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getMessageUserid() {
        return messageUserid;
    }

    public void setMessageUserid(Integer messageUserid) {
        this.messageUserid = messageUserid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}