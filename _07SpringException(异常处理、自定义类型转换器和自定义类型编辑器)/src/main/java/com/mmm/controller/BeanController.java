package com.mmm.controller;

import com.mmm.controller.pexception.AgeException;
import com.mmm.controller.pexception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


/**
 * 目前只处理异常   后续使用Controller中公共的代码书写出
 */
@Controller
public class BeanController {

    /**
     * 只要是继承了BaseController的类中出现了NameException异常
     * 就会进入此方法进行处理
     */
    @ExceptionHandler(NameException.class)
    public ModelAndView nameException(NameException ex){
        System.out.println("进入了=========NameException");

        ModelAndView mv =new ModelAndView("errors/nameException");
        mv.addObject("ex",ex);
        return mv;
    }

    @ExceptionHandler(AgeException.class)
    public ModelAndView nameException(AgeException ex){
        System.out.println("进入了=========AgeException");
        ModelAndView mv =new ModelAndView("errors/ageException");
        mv.addObject("ex",ex);
        return mv;
    }
    /**
     * 除了上面的name和age异常之外的其他异常进入此方法
     */
    @ExceptionHandler
    public ModelAndView defaultException(Exception ex){
        System.out.println("进入了=========Exception");
        ModelAndView mv =new ModelAndView("errors/defaulError");
        mv.addObject("ex",ex);
        return mv;

    }


}
