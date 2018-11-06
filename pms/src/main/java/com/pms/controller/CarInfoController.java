package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms.modal.userCarID;
import com.pms.service.getCarID;

@Controller
@RequestMapping("/car")
public class CarInfoController 
{
	 @Resource
	 private getCarID carID;
	 
	@RequestMapping("MyCarId")
	public void getUserCarID(HttpServletRequest request,HttpServletResponse response) 
	{
		String phone=request.getParameter("userPhone");
		PrintWriter out;
		userCarID myCarId=new userCarID();
		myCarId.setUserCarID(carID.getCarId(phone));
		response.setContentType("Application/json");
		response.setCharacterEncoding("utf-8");
		myCarId.setCode(response.getStatus());
		if(response.getStatus()==200)
			myCarId.setMessage("返回成功");
		try {
			out=response.getWriter();
			out.print(myCarId.toJson());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	

}
