package com.pms.modal;

import org.json.JSONObject;

public abstract class AbstractJson {
	
	protected JSONObject r;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private int code;
	private String message;
	public abstract String jsonToString();
	public JSONObject getR() {
		return r;
	}
	public void setR(JSONObject r) {
		this.r = r;
	}
}
