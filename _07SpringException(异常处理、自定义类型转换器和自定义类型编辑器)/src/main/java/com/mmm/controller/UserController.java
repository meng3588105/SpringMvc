package com.mmm.controller;

import com.mmm.controller.bean.User;
import com.mmm.controller.pexception.AgeException;
import com.mmm.controller.pexception.NameException;
import org.omg.CORBA.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController extends BeanController{

    @RequestMapping("/add")
    public String addUser(User user) throws UserException{
        System.out.println("进入了===》Add");
        if (!"admin".equals(user.getName())){
            throw  new NameException("用户名错误");
        }
        if (0>user.getAge()){
            throw new AgeException("年龄错误");
        }

        System.out.println(5/0);//模拟默认异常 除数不能为0
        return "forward:/userMain:";
    }

    @RequestMapping("/userNain")
    public ModelAndView userMain(User user){
        System.out.println("进入了===》userMain");
        ModelAndView mv =new ModelAndView("index");
        mv.addObject("user",user);
        return mv;

    }


}
