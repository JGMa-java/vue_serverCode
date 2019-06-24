package com.vueServer.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MaJianGuo on 2019/02/11.下午 04:19
 * 全局捕获异常和自定义全局捕获异常
 */
@ControllerAdvice
public class MyControllerAdvice {

    private static final Logger log = LoggerFactory.getLogger(MyControllerAdvice.class);

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     *
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {}

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     *
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "Magical Sam");
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> exceptionHandler(Exception ex){
        Map<String,Object> map  = new HashMap<String,Object>();
        map.put("code",1001);
        map.put("msg",ex.getMessage());
        //发生异常进行日志记录，写入数据库或者其他处理
        log.error(ex.getMessage(),ex);
        return map;
    }

    // 拦截捕捉自定义异常 MyException.class
//    @ResponseBody
//    @ExceptionHandler(value = MyException.class)
//    public Map<String,Object> myExceptionHandler(MyException myex){
//        Map<String,Object> map  = new HashMap<String,Object>();
//        map.put("code",myex.getCode());
//        map.put("message",myex.getMessage());
//        map.put("method",myex.getMethod());
//        map.put("descinfo",myex.getDescinfo());
//        //发生异常进行日志记录，写入数据库或者其他处理
//        return map;
//    }

}
