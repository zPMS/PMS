package com.pms.service;

import com.pms.modal.ReturnLoginCode;

public interface LoginService {
	public boolean isRegister(String userTel);
	public void sendMessCode(String userTel,ReturnLoginCode login);

}
