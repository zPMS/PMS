package com.pms.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.pms.dao.CarInfoMapper;
import com.pms.modal.CarID;
import com.pms.service.GetCarIDService;


@Service
@Transactional
public class GetCarIdServiceImpl implements GetCarIDService {

    @Resource
    public CarInfoMapper carMapper;
    
	public List<CarID> getCarId(String userTel)
	{
		
		return this.carMapper.getUserCarId(userTel);
	}

   
}
