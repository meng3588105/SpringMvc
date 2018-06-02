package com.mmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
/**
 * 文件上传名称的规范：
 * 系统毫秒数+随机数+文件名称
 *  防止文件覆盖
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 单文件上传
     */
/*
    @RequestMapping("/add")
    public String uploadFile(@RequestParam MultipartFile  file, HttpSession session){
        System.out.println("进入了文件上传 ");
                //获取文件上传的名字
            String fileName=  file.getOriginalFilename();
            try {
                //上传到哪里路径
                file.transferTo(new File("G:/file",fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            //跳转页面
        return "success";
    }
    */


    /**
     *
     * 多个文件传  用循环
     *
     */
    @RequestMapping("/add")
    public String uploadFile(@RequestParam MultipartFile[]files, HttpSession session){
        System.out.println("多文件上传 ");
        for (MultipartFile file:files){
            //获取文件上传的名字
            String fileName=  file.getOriginalFilename();
            try {
                //上传到哪里路径
                file.transferTo(new File("G:/file",fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            //跳转页面
        return "success";
    }




}

