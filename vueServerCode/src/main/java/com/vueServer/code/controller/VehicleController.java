package com.vueServer.code.controller;

import com.vueServer.code.pojo.T_VEHICLE;
import com.vueServer.code.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Majg on 2019-05-13
 **/
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/findAllVehicle")
    public List<T_VEHICLE> findAll(String ss){
        return vehicleService.findAll();
    }

    @PostMapping(value = "/addVehicle")
    public T_VEHICLE addVehicle(T_VEHICLE param){
        vehicleService.addVehicle(param);
        return vehicleService.findById(param);
    }

}
