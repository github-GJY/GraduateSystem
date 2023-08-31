package com.graduate.controller;

import com.graduate.enity.Admin;
import com.graduate.enity.User;
import com.graduate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginController {

    @Resource
    private UserService service;

    @RequestMapping("/login")
    public ModelAndView loginForward() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    /*
     * 登录权限判断以及登录检查
     * */
    @RequestMapping("login.do")
    public ModelAndView loginUser(String studentID, String password, HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(studentID);
        Integer account = new Integer(studentID);
        System.out.println(account + "\t" + password);
        Admin admin = service.selectAdmin(account, password);
        if (admin == null) {
//            管理员判断
//           modelAndView.setViewName("admin.jsp");
//           return modelAndView;
//            普通用户判断
            User user = service.selectUser(account, password);
            if (user == null) {
                try {
                    PrintWriter out = null;
                    out = response.getWriter();
                    System.out.println("1");
                    out.print("<script>" +
                            " alert('未找到对应的账户');window.location.href='http://localhost:8080/GraduateManageSystem/login'; " +
                            "</script>");
                    out.flush();
                    out.close();
                    modelAndView.setViewName("login.html");
                    return modelAndView;

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                HttpSession session = request.getSession();
                session.setAttribute("graduateID",user.getAccount());
                System.out.println("2");
                System.out.println("跳转成功");
                modelAndView.setViewName("studentIndex.jsp");
                return modelAndView;
            }
        }
        HttpSession session = request.getSession();
        session.setAttribute("graduateID",admin.getAccount());
        System.out.println("跳转成功");
        modelAndView.setViewName("admin.jsp");
        return modelAndView;
    }

    //把会话中的id移除
    @RequestMapping("/remove/log_out")
    public void removeLogOut(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("graduateID");
        PrintWriter out=response.getWriter();
        out.print("<script>" +
                "history.back(-1)" +
                "</script>");
        out.flush();
        out.close();
    }
}
