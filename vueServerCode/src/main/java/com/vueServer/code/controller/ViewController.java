package com.vueServer.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MaJianGuo on 2019/02/12.下午 03:24
 */
@Controller
public class ViewController {
    @RequestMapping("/index")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/vehicleindex")
    public  String vehicleView(){
        return "vehicle";
    }

    @GetMapping("/easyuiindex")
    public  String easyuiView(){
        return "easyui";
    }

}
