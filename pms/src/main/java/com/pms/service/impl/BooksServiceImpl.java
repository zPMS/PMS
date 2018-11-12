package com.pms.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pms.dao.ReservationMapper;
import com.pms.modal.Books;
import com.pms.service.BooksService;
@Service
@Transactional
public class BooksServiceImpl implements BooksService{
	@Resource
	private ReservationMapper reservation;
	public BooksServiceImpl() {
		// TODO 自动生成的构造函数存根
	}

	public List<Books> getMyBook(String userid) {
		return this.reservation.myBook(userid);
	}

	public List<Books> getHisBook(String userid) {
		
		return this.reservation.myHistoryBook(userid);
	}

	public int delay(String rsvid,Date reserveStartTime, Date reserveFinishTime) {
		
		return this.reservation.delay(rsvid, reserveStartTime, reserveFinishTime);
	}

	public int cancel(String reserveid) {
		
		return this.reservation.cancel(reserveid);
	}

}
