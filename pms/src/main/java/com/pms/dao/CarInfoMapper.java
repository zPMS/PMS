package com.pms.dao;

import java.util.List;

import com.pms.modal.CarID;
import com.pms.pojo.CarInfo;
import com.pms.pojo.CarInfoKey;

public interface CarInfoMapper {
    int deleteByPrimaryKey(CarInfoKey key);
    int insert(CarInfo record);
    int insertSelective(CarInfo record);
    CarInfo selectByPrimaryKey(CarInfoKey key);
    int alterCarId(String userid,String newCarId,String oldCarId);
    List<CarID> getUserCarId(String userTel);
    int updateByPrimaryKeySelective(CarInfo record);
    int updateByPrimaryKey(CarInfo record);
}