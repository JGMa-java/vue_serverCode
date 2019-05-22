//package com.vueServer.code.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
///**
// * @author MaJianGuo.
// * @Date Created in 下午 04:20. 2019/01/08
// * @Description
// * @Version
// */
//@Controller
//public class MyErrorController implements ErrorController {
//
//    private static final Logger log = LoggerFactory.getLogger(MyErrorController.class);
//
//    @Override
//    public String getErrorPath() {
//        log.error("出错了=======================");
//        return "/error";
//    }
//
//    @RequestMapping(value = "/error")
//    public Object error(HttpServletResponse resp, HttpServletRequest req,Exception e) {
//        // 错误处理逻辑
//        log.error(e+"");
//        return "404";
//    }
//}
