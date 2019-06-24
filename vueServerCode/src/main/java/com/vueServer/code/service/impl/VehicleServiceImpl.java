package com.vueServer.code.service.impl;

import com.vueServer.code.dao.T_VEHICLEMapper;
import com.vueServer.code.pojo.T_VEHICLE;
import com.vueServer.code.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Majg on 2019-05-13
 **/
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private T_VEHICLEMapper t_vehicleMapper;

    @Override
    public List<T_VEHICLE> findAll() {
        return t_vehicleMapper.findAll();
    }

    @Override
    @Transactional
    public void addVehicle(T_VEHICLE param) {
        t_vehicleMapper.insertSelective(param);
    }

    @Override
    public T_VEHICLE findById(T_VEHICLE param) {
        return t_vehicleMapper.selectByPrimaryKey(param.getHphm(),param.getHpzl());
    }
}
