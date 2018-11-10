package com.pms.pojo;

public class CarInfoKey {
    private String userid;

    private String usercarid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsercarid() {
        return usercarid;
    }

    public void setUsercarid(String usercarid) {
        this.usercarid = usercarid == null ? null : usercarid.trim();
    }
}