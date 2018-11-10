package com.pms.service;

import java.util.List;

import com.pms.modal.CarID;

public interface GetCarID 
{
	public List<CarID> getCarId(String userTel);
}
