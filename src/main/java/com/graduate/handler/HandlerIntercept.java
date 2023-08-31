package com.graduate.handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class HandlerIntercept implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入拦截器");
        //获取登录成功的session
        Object graduateID = request.getSession().getAttribute("graduateID");
        if (graduateID==null){
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.print("<script language='javascript'>alert('请登录后再进行操作');window.open('http://localhost:8080/GraduateManageSystem/login');</script>");
           /* request.setAttribute("msg","请登录后再进行操作");
            request.getRequestDispatcher("/login.html").forward(request,response);  //转发跳转*/
            out.flush();
            out.close();
            return false;
        }else {
            return true;
        }
    }
}
