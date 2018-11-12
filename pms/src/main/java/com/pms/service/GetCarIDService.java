package com.pms.service;

import java.util.List;

import com.pms.modal.CarID;

public interface GetCarIDService 
{
	public List<CarID> getCarId(String userTel);
}
