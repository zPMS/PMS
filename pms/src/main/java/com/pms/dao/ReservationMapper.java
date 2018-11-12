package com.pms.dao;

import java.util.Date;
import java.util.List;
import com.pms.modal.Books;
import com.pms.pojo.Reservation;
public interface ReservationMapper {
    int cancel(String reserveid);
    int insert(Reservation record);
    int insertSelective(Reservation record);
    List<Books> myBook(String userid);
    List<Books> myHistoryBook(String userid);
    int  delay(String rsvid,Date reserveStartTime,Date reserveFinishTime);
    Reservation selectByPrimaryKey(String reserveid);
    int updateByPrimaryKeySelective(Reservation record);
    int updateByPrimaryKey(Reservation record);
}