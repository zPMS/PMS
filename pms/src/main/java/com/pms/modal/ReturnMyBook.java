package com.pms.modal;

import java.util.List;

import org.json.JSONObject;

public class ReturnMyBook extends AbstractJson {

	public ReturnMyBook() {
		// TODO 自动生成的构造函数存根
	}
	private List<Books> myBooks;
	public void getStatus(int code)
	{
		setCode(code);
		//r=new JSONObject();
		if(code==200)
		{
		setMessage("获取预约信息成功");
		r.put("code", getCode());
		r.put("message", getMessage());
		r.put("myBooks", myBooks);
		}
		if(code==400)
		{
			setMessage("获取当前预约信息失败");
			//r=new JSONObject();
			r.put("code", getCode());
			r.put("message", getMessage());
		}
	}
	public List<Books> getMyBooks() {
		return myBooks;
	}
	public void setMyBooks(List<Books> myBooks) {
		this.myBooks = myBooks;
	}
	@Override
	public String jsonToString() {
		// TODO 自动生成的方法存根
		System.out.println("myBooks:"+r.toString());
		return r.toString();
	}

}
