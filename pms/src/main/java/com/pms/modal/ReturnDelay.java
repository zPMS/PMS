package com.pms.modal;

import org.json.JSONObject;

public class ReturnDelay extends AbstractJson{

	public ReturnDelay() {
		// TODO 自动生成的构造函数存根
	}
	private int result;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public void getStatus(int code)
	{
		setCode(code);
		//r=new JSONObject();
		if(result!=0&&code==200)
		{
			setMessage("预约时间已更新");
		}
		else if(result==0&&code==200)
		{
			setMessage("预约时间未更新");
		}
		if(code==400)
		{
			setMessage("延迟预约失败");
		}
		r.put("code", getCode());
		r.put("message", getMessage());
	}
	@Override
	public String jsonToString() {
		// TODO 自动生成的方法存根
		System.out.println("cancel:"+r.toString());
		return r.toString();
	}

}
