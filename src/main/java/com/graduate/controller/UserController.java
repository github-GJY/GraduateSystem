package com.graduate.controller;

import com.graduate.enity.User;
import com.graduate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UserController {

    @Resource
    UserService service;


    @RequestMapping("/modify/password")
    @ResponseBody
    public void modifyPassword(String password, String newPwd, HttpServletRequest request, HttpServletResponse response) throws IOException, InterruptedException, ServletException {
        ModelAndView modelAndView = new ModelAndView();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(password + "\n" + newPwd);
        HttpSession session = request.getSession();
        Object id = session.getAttribute("graduateID");
        Integer graduateID = (Integer) id;
        User user = service.selectUser2(graduateID, password);
        PrintWriter out = null;
        out = response.getWriter();
        if (user != null) {
            int i = service.updatePwd2(graduateID, newPwd);
            if (i > 0) {
                session.removeAttribute("graduateID");
                out.print("<script>" +
                        "alert('密码修改成功，请使用新密码重新登录');" +
                        "window.location.href='http://localhost:8080/GraduateManageSystem/login';" +
                        "</script>");
                out.flush();
                out.close();
            }
        } else {
            System.out.println("666");
            out.print("<script>" +
                    "alert('密码错误，请检查后重新修改');" +
                    "history.back(-1)" +
                    "</script>");
            out.flush();
            out.close();
        }
    }
}
