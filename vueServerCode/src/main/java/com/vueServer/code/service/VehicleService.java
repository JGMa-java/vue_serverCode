package com.vueServer.code.service;

import com.vueServer.code.pojo.T_VEHICLE;

import java.util.List;

/**
 * Created by Majg on 2019-05-13
 **/
public interface VehicleService {

    List<T_VEHICLE> findAll();

    void addVehicle(T_VEHICLE param);

    T_VEHICLE findById(T_VEHICLE param);
}
