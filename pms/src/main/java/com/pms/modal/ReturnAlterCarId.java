package com.pms.modal;

import org.json.JSONObject;

public class ReturnAlterCarId extends AbstractJson{

	public ReturnAlterCarId() {
		// TODO 自动生成的构造函数存根
	}
	
	public void getStatus(int code)
	{
		setCode(code);
		if(code==200)
		{
			setMessage("修改成功");
			r=new JSONObject();
			r.put("code", getCode());
			r.put("message", getMessage());
		}
		if(code==400)
		{
			setMessage("修改用户车牌信息失败");
			r=new JSONObject();
			r.put("code", getCode());
			r.put("message", getMessage());
		}
	}
	@Override
	public String jsonToString() {
		// TODO 自动生成的方法存根
		System.out.println(r.toString());
		return r.toString();
	}

}
