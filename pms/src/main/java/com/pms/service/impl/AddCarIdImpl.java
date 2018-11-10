package com.pms.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pms.dao.CarInfoMapper;
import com.pms.pojo.CarInfo;
import com.pms.service.AddCarId;

@Service
@Transactional
public class AddCarIdImpl implements AddCarId
{
	
	@Resource
	 public CarInfoMapper carMapper;
	public void addCarId(CarInfo car) 
	{
		// TODO 自动生成的方法存根
		this.carMapper.insert(car);
		
	}
	
	
	

}
