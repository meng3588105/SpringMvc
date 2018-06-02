package com.mmm.controller.resolver;

import com.mmm.controller.pexception.AgeException;
import com.mmm.controller.pexception.NameException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 第二种 自定义处理异常
 *
 * 实现HandlerExceptionResolver接口
 */
public class MyExceptionResolver implements HandlerExceptionResolver {


        /**
         *
     * @param request  请求
     * @param response  响应
     * @param handler   哪个处理器发生了异常
     * @param ex        处理器发生了什么异常
     * @return          视图和数据
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("进入了==========自定义异常处理器");
        ModelAndView mv = new ModelAndView("errors/defaulError");//默认的异常视图
        mv.addObject("ex",ex);//异常信息
        if (ex instanceof NameException){
            mv.setViewName("errors/nameException");
        }
        if (ex instanceof AgeException){
            mv.setViewName("errors/ageException");
        }

        return mv;
    }
}
