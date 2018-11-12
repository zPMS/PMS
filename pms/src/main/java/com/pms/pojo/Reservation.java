package com.pms.pojo;

import java.util.Date;

public class Reservation {
    private String reserveid;

    private String userid;

    private String parkid;

    private Date reserveStartTime;

    private Integer reserveFinishTime;

    private String usercarid;

    private String parkpositionid;

    private String reservecharge;

    private Date createTime;

    private Date lastModifyTime;

    public String getReserveid() {
        return reserveid;
    }

    public void setReserveid(String reserveid) {
        this.reserveid = reserveid == null ? null : reserveid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getParkid() {
        return parkid;
    }

    public void setParkid(String parkid) {
        this.parkid = parkid == null ? null : parkid.trim();
    }

    public Date getReserveStartTime() {
        return reserveStartTime;
    }

    public void setReserveStartTime(Date reserveStartTime) {
        this.reserveStartTime = reserveStartTime;
    }

    public Integer getReserveKeepTime() {
        return reserveFinishTime;
    }

    public void setReserveKeepTime(Integer reserveFinishTime) {
        this.reserveFinishTime = reserveFinishTime;
    }

    public String getUsercarid() {
        return usercarid;
    }

    public void setUsercarid(String usercarid) {
        this.usercarid = usercarid == null ? null : usercarid.trim();
    }

    public String getParkpositionid() {
        return parkpositionid;
    }

    public void setParkpositionid(String parkpositionid) {
        this.parkpositionid = parkpositionid == null ? null : parkpositionid.trim();
    }

    public String getReservecharge() {
        return reservecharge;
    }

    public void setReservecharge(String reservecharge) {
        this.reservecharge = reservecharge == null ? null : reservecharge.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}