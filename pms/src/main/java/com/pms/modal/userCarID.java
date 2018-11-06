package com.pms.modal;

import java.util.List;

import org.json.JSONObject;

public class userCarID extends AbstractJson
{

	private List<CarID> userCarID;

	@Override
	public JSONObject toJson() {
		// TODO 自动生成的方法存根
		JSONObject uCarId=new JSONObject();
		uCarId.put("code", getCode());
		uCarId.put("message", getMessage());
		uCarId.put("userCarId", userCarID);
		System.out.println(uCarId.toString());
		return uCarId;
	}

	public List<CarID> getUserCarID() {
		return userCarID;
	}

	public void setUserCarID(List<CarID> userCarID) {
		this.userCarID = userCarID;
	}

}
