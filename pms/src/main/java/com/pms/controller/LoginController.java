package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms.modal.ReturnLoginCode;
import com.pms.service.LoginService;
import com.pms.service.impl.LoginServiceImpl;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Resource 
	private LoginService service;
	public LoginController() {
		// TODO 自动生成的构造函数存根
	}
	@RequestMapping("/MsgCode")
	public void msgCode(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		service=new LoginServiceImpl();
		String userTel=request.getParameter("userTel");
		ReturnLoginCode login=new ReturnLoginCode();
		login.setFlag(service.isRegister(userTel));
		if(service.isRegister(userTel))
		service.sendMessCode(userTel, login);
		login.getStatus(response.getStatus());
		PrintWriter out=response.getWriter();
		out.println(login.jsonToString());
	}
}
