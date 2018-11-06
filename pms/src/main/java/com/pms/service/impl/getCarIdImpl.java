package com.pms.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.json.JSONArray;
import org.springframework.stereotype.Service;
import com.pms.dao.CarInfoMapper;
import com.pms.modal.CarID;
import com.pms.pojo.CarInfoKey;
import com.pms.service.getCarID;


@Service
@Transactional
public class getCarIdImpl implements getCarID {

    @Resource
    public CarInfoMapper carMapper;
    public CarInfoKey carKey;
	public List<CarID> getCarId(String userTel) {
		// TODO 自动生成的方法存根
		return this.carMapper.getUserCarId(userTel);
	}

   
}
