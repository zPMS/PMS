package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms.modal.userCarID;
import com.pms.pojo.CarInfo;
import com.pms.service.AddCarId;
import com.pms.service.GetCarID;

@Controller
@RequestMapping("/car")
public class CarInfoController 
{
	 @Resource
	 private GetCarID carID;
	 
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
			out.print(myCarId.jsonToString());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	 @Resource
	 private AddCarId addCarId;
	@RequestMapping("AddCarId")
	public void addCarID(HttpServletRequest request,HttpServletResponse response)
	{
		CarInfo car = new CarInfo();
		car.setUserid(request.getParameter("userId"));
		car.setUsertel(request.getParameter("userPhone"));
		car.setUsercarid(request.getParameter("carId"));
		SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		Timestamp time=Timestamp.valueOf(formate.format(date.getTime()));
		car.setCreateTime(time);
		car.setLastModifyTime(time);
		addCarId.addCarId(car);
	}

}
