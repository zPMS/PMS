package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pms.modal.ReturnCancel;
import com.pms.modal.ReturnDelay;
import com.pms.modal.ReturnHisBook;
import com.pms.modal.ReturnMyBook;
import com.pms.service.BooksService;
import com.pms.service.impl.BooksServiceImpl;

@Controller
@RequestMapping("/myBook")
public class BookController {

	public BookController() {
		// TODO 自动生成的构造函数存根
	}
	@Resource 
	private BooksService bservice;
	@RequestMapping("myBook")
	public void getMyBook(HttpServletRequest request,HttpServletResponse response ) throws IOException
	{
		String userid=request.getParameter("userid");
		response.setContentType("Application/json");
		response.setCharacterEncoding("utf-8");
		bservice=new BooksServiceImpl();
		ReturnMyBook mybook=new ReturnMyBook();
		mybook.setMyBooks(bservice.getMyBook(userid));
		PrintWriter out=response.getWriter();
		mybook.getStatus(response.getStatus());
		out.println(mybook.jsonToString());
	}
	@RequestMapping("myHistoryBook")
	public void getMyHistoryBook(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String userid=request.getParameter("userid");
		response.setContentType("Application/json");
		response.setCharacterEncoding("utf-8");
		bservice=new BooksServiceImpl();
		ReturnHisBook hisbook=new ReturnHisBook();
		hisbook.setHistoryBooks(bservice.getHisBook(userid));
		PrintWriter out=response.getWriter();
		hisbook.getStatus(response.getStatus());
		out.println(hisbook.jsonToString());
	}
	@RequestMapping("delay")
	public void delay(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String rsvid=request.getParameter("rsvNo");
		Timestamp  reserveStartTime=Timestamp.valueOf(request.getParameter("delayDate"));
		Timestamp  reserveFinishTime=Timestamp.valueOf(request.getParameter("delayTime"));
		response.setContentType("Application/json");
		response.setCharacterEncoding("utf-8");
		bservice=new BooksServiceImpl();
		ReturnDelay delay=new ReturnDelay();
		delay.setResult(bservice.delay(rsvid, reserveStartTime, reserveFinishTime));
		PrintWriter out=response.getWriter();
		delay.getStatus(response.getStatus());
		out.println(delay.jsonToString());
	}
	@RequestMapping("cancel")
	public void cancel(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String reserveid=request.getParameter("rsvNo");
		response.setContentType("Application/json");
		response.setCharacterEncoding("utf-8");
		bservice=new BooksServiceImpl();
		ReturnCancel cancel=new ReturnCancel();
		cancel.setResult(bservice.cancel(reserveid));
		PrintWriter out=response.getWriter();
		cancel.getStatus(response.getStatus());
		out.println(cancel.jsonToString());
	}
}
