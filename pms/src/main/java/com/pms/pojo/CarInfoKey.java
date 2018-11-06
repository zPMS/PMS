package com.pms.pojo;

public class CarInfoKey {
    private Integer userid;

    private String usercarid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsercarid() {
        return usercarid;
    }

    public void setUsercarid(String usercarid) {
        this.usercarid = usercarid == null ? null : usercarid.trim();
    }
}