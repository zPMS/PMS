package com.pms.service;

import java.util.List;

import com.pms.modal.CarID;
import com.pms.pojo.CarInfo;

public interface CarIdService {
	public void alterCarId(String userid,String newCarId,String oldCarId);
	public List<CarID> getCarId(String userTel);
	public void addCarId(CarInfo car);
}
