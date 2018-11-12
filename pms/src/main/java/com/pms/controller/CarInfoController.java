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

import com.pms.modal.ReturnAddCarId;
import com.pms.modal.ReturnAlterCarId;
import com.pms.modal.ReturnUserCarID;
import com.pms.pojo.CarInfo;
import com.pms.service.AddCarIdService;
import com.pms.service.GetCarIDService;
import com.pms.service.AlterCarIDService;

@Controller
@RequestMapping("/car")
public class CarInfoController 
{
	 @Resource
	 private GetCarIDService carID;
	 
	@RequestMapping("MyCarId")
	public void getUserCarID(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		String phone=request.getParameter("userPhone");
		PrintWriter out;
		ReturnUserCarID myCarId=new ReturnUserCarID();
		myCarId.setUserCarID(carID.getCarId(phone));
		response.setContentType("Application/json");
		response.setCharacterEncoding("utf-8");
			myCarId.getStatus(response.getStatus());
			out=response.getWriter();
			out.print(myCarId.jsonToString());
	}
	 @Resource
	 private AddCarIdService addCarId;
	@RequestMapping("AddCarId")
	public void addCarID(HttpServletRequest request,HttpServletResponse response) throws IOException
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
		response.setContentType("Application/json");
		response.setCharacterEncoding("utf-8");
		ReturnAddCarId r=new ReturnAddCarId();
		r.getStatus(response.getStatus());
		PrintWriter out=response.getWriter();
		out.println(r.jsonToString());
	}
	 @Resource
	 private AlterCarIDService alterCarId;
	 @RequestMapping("AlterCarId")
		public void alterCarID(HttpServletRequest request,HttpServletResponse response) throws IOException
		{
		 	alterCarId.alterCarId(request.getParameter("userId"), request.getParameter("newCarId"), request.getParameter("oldCarId"));
		 	response.setContentType("Application/json");
			response.setCharacterEncoding("utf-8");
			ReturnAlterCarId r=new ReturnAlterCarId();
			r.getStatus(response.getStatus());
			PrintWriter out=response.getWriter();
			out.println(r.jsonToString());
		}
	 
}
