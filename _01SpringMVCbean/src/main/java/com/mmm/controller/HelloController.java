package com.mmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.AbstractController;


/**
 * 处理用户请求的地方
 *
 */
@Controller
public class HelloController  {
    //标记点
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("进入了hello");

        return "/WEB-INF/index.jsp";

    }
    //标记点
    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println("进入了hello2");

        return "/WEB-INF/index.jsp";

    }

}
