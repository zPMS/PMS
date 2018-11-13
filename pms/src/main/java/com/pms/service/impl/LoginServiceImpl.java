package com.pms.service.impl;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

import com.pms.dao.UserInfoMapper;
import com.pms.modal.ReturnLoginCode;
import com.pms.service.LoginService;
import com.pms.utils.RandomUtil;
import com.pms.utils.SendUtil;

public class LoginServiceImpl implements LoginService{

	public LoginServiceImpl() {
		// TODO 自动生成的构造函数存根
	}
	private UserInfoMapper user;
	public boolean isRegister(String userTel) {
		// TODO 自动生成的方法存根
		return this.user.isRegister(userTel);
	}
	public void sendMessCode(String userTel,ReturnLoginCode login)
	{
		int random=RandomUtil.getRandNum();
		SendUtil send=new SendUtil();
		try {
			send.sendMess(userTel, random,login);
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
