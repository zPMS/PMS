package com.pms.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pms.dao.CarInfoMapper;
import com.pms.service.AlterCarIDService;
@Service
@Transactional
public class AlterCarIServiceDImpl implements AlterCarIDService {

	public AlterCarIServiceDImpl() {
		// TODO 自动生成的构造函数存根
	}
	@Resource
	private CarInfoMapper carMapper;
	public void alterCarId(String userid, String newCarId, String oldCarId) 
	{
		this.carMapper.alterCarId(userid, newCarId, oldCarId);
		
	}


}
