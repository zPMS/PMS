package com.pms.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.pms.dao.CarInfoMapper;
import com.pms.modal.CarID;
import com.pms.service.GetCarID;


@Service
@Transactional
public class GetCarIdImpl implements GetCarID {

    @Resource
    public CarInfoMapper carMapper;
    
	public List<CarID> getCarId(String userTel)
	{
		
		return this.carMapper.getUserCarId(userTel);
	}

   
}
