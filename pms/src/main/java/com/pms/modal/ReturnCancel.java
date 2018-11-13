package com.pms.modal;

import org.json.JSONObject;

public class ReturnCancel extends AbstractJson {

	public ReturnCancel() {
		// TODO 自动生成的构造函数存根
	}
	private int result;
	public void getStatus(int code)
	{
		setCode(code);
		//r=new JSONObject();
		if(result!=0&&code==200)
		{
			setMessage("取消预约成功");
		}
		else if(result==0&&code==200)
		{
			setMessage("由于未知原因，预约未取消");
		}
		if(code==400)
		{
			setMessage("取消预约失败");
		}
		r.put("code", getCode());
		r.put("message", getMessage());
	}
	@Override
	public String jsonToString() {
		// TODO 自动生成的方法存根
		return null;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

}
