package com.pms.modal;

import java.math.BigDecimal;
import java.util.Date;

public class Books {

	public Books() {
		// TODO 自动生成的构造函数存根
	}
	private String parkNo;
	private String parkName;
	private String parkAdress;
	private String parkPostionId;
	private Date rsvDate;
	private int rsvTime;
	public Date getRsvDate() {
		return rsvDate;
	}
	public void setRsvDate(Date rsvDate) {
		this.rsvDate = rsvDate;
	}
	public void setRsvTime(int rsvTime) {
		this.rsvTime = rsvTime;
	}
	private BigDecimal destinationLat;
	private BigDecimal destinationLng;
	private String rsvNo;
	private double cost;
	public String getParkNo() {
		return parkNo;
	}
	public void setParkNo(String parkNo) {
		this.parkNo = parkNo;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getParkAdress() {
		return parkAdress;
	}
	public void setParkAdress(String parkAdress) {
		this.parkAdress = parkAdress;
	}
	public String getParkPostionId() {
		return parkPostionId;
	}
	public void setParkPostionId(String parkPostionId) {
		this.parkPostionId = parkPostionId;
	}

	public int getRsvTime() {
		return rsvTime;
	}
	public BigDecimal getDestinationLat() {
		return destinationLat;
	}
	public void setDestinationLat(BigDecimal destinationLat) {
		this.destinationLat = destinationLat;
	}
	public BigDecimal getDestinationLng() {
		return destinationLng;
	}
	public void setDestinationLng(BigDecimal destinationLng) {
		this.destinationLng = destinationLng;
	}
	public String getRsvNo() {
		return rsvNo;
	}
	public void setRsvNo(String rsvNo) {
		this.rsvNo = rsvNo;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
