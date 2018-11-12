package com.pms.service;

import java.util.Date;
import java.util.List;

import com.pms.modal.Books;

public interface BooksService 
{
	public List<Books> getMyBook(String userid);
	public List<Books> getHisBook(String userid);
	public int delay(String rsvid,Date reserveStartTime, Date reserveFinishTime);
	public int cancel(String reserveid);
}
