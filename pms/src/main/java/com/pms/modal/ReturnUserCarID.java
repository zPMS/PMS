package com.pms.modal;

import java.util.List;

import org.json.JSONObject;

public class ReturnUserCarID extends AbstractJson
{

	private List<CarID> userCarID;
	public void getStatus(int code)
	{
		setCode(code);
		if(code==200)
		{
			setMessage("返回成功");
			r=new JSONObject();
			r.put("code", getCode());
			r.put("message", getMessage());
			r.put("userCarId", userCarID);
		}
		if(code==400)
		{
			setMessage("返回用户车牌信息失败");
			r=new JSONObject();
			r.put("code", getCode());
			r.put("message", getMessage());
		}
	}
	@Override
	public String jsonToString() { 
		System.out.println(r.toString());
		return r.toString();
	}

	public List<CarID> getUserCarID() {
		return userCarID;
	}

	public void setUserCarID(List<CarID> userCarID) {
		this.userCarID = userCarID;
	}

}
