package com.mmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/model")
public class ModelController {
    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了Modeladd");
        return "success";
    }

    @RequestMapping("/update")
    public String update(HttpServletRequest request,HttpServletResponse response){
        System.out.println("进入了Modelupdate");
        return "success";
    }

    /**
     * 通配符的使用
     * *：代表这一级目录必须得有
     * /a/delete      true
     * /delete        false
     * /a/b/delete    false
     *
     * **:代表这级目录 可有可无 ，还可以有多级目录
     * /a/delete      true
     * /delete        true
     * /a/b/delete    true
     *
     */
    @RequestMapping("/**/delete")
    public String delete(){
        System.out.println("进入Modeldelete");
        return "success";
    }


}
