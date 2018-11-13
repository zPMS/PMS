package com.pms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.pms.dao.CarInfoMapper;
import com.pms.modal.CarID;
import com.pms.pojo.CarInfo;
import com.pms.service.CarIdService;

public class CarIdServiceImpl implements CarIdService{

	public CarIdServiceImpl() {
		// TODO 自动生成的构造函数存根
	}
	@Resource
	private CarInfoMapper carMapper;
	public void alterCarId(String userid, String newCarId, String oldCarId) 
	{
		this.carMapper.alterCarId(userid, newCarId, oldCarId);
	}
	public void addCarId(CarInfo car) 
	{
		this.carMapper.insert(car);
		
	}
		public List<CarID> getCarId(String userTel)
		{	
			return this.carMapper.getUserCarId(userTel);
		}


}
