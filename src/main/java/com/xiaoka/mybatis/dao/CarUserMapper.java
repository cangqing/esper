package com.xiaoka.mybatis.dao;


import com.xiaoka.mybatis.CarUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarUser record);

    int insertSelective(CarUser record);

    CarUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarUser record);

    int updateByPrimaryKey(CarUser record);

    @Select("SELECT * FROM car_user limit 10")
    List<CarUser> getUsers();
}