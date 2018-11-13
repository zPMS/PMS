package com.pms.modal;

import org.json.JSONObject;

public class ReturnLoginCode extends AbstractJson{

	public ReturnLoginCode() {
		// TODO 自动生成的构造函数存根
	}
	private boolean flag;
	private int msgCode;
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public int getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(int msgCode) {
		this.msgCode = msgCode;
	}
	public void getStatus(int code)
	{
		setCode(code);
		//r=new JSONObject();
		if(code==200&&flag==true)
		{
			//setMessage("验证码发送成功");
			r.put("code", getCode());
			r.put("message", getMessage());
			r.put("msgCode", getMsgCode());
		}
		else
		if(code==200&&flag==false)
		{
			setMessage("该用户尚未注册");
		}
	}
	@Override
	public String jsonToString() {
		System.out.println("LoginCode："+r.toString());
		return r.toString();
	}

}
