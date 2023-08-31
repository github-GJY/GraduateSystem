package com.graduate.controller;


import com.graduate.enity.GraduateBaseInf;
import com.graduate.service.GraduateBaseInfService;
import com.graduate.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
import java.util.Date;
import java.util.List;

@Controller
public class GraduateBaseInfController {

    @Resource
    private GraduateBaseInfService service;

    @Resource
    private UserService userService;

    //跳转学生信息页面
    @RequestMapping("/forward/studentInf")
    public ModelAndView forwardStudentInf(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentInf.html");
        return modelAndView;
    }

    //跳转添加修改基本信息页面
    @RequestMapping("/forward/add_modify")
    public String forwardAddModify(){
        return "modify_and_addBaseInf.html";
    }

    //查询毕业生信息
    @RequestMapping("/select/studentInf")
    @ResponseBody
    public GraduateBaseInf forwardGraduateBaseInf(HttpServletRequest request){
        HttpSession session = request.getSession();
        Object id = session.getAttribute("graduateID");
        Integer graduateID = (Integer) id;
        GraduateBaseInf studentInf = service.findOwnStudentInf(graduateID);
        System.out.println(studentInf);
        return studentInf;
    }
  /*  @RequestMapping("/select/studentInf")
    public Object selectGraduateBaseInf(HttpSession session){
        return session.getAttribute("studentInf");
    }*/

    //插入毕业生基本信息
    @RequestMapping("/insert/studentInf")
    public void insertGraduateBaseInf(String id, String name, String gender, String ethnic, String place, String graduatetime,String professional, String status,HttpServletResponse response) throws IOException {
        Integer account = new Integer(id);
        Integer graduateID = account;
        System.out.println(graduateID);
        service.insertGraduateBaseInf(graduateID,name,gender,ethnic,place,graduatetime,professional,status);
        service.insertStudentAccount();
        PrintWriter out = null;
        out = response.getWriter();
        out.print("<script>" +
                "alert('添加成功');window.location.href = 'http://localhost:8080/GraduateManageSystem/forward/add_modify';" +
                "</script>");
    }

    //修改毕业生信息
    @RequestMapping("/update/studentInf")
    @ResponseBody
    public void updateGraduateBaseInf(String id, String name, String ethnic, String place, String status, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer graduateID = new Integer(id);
        int i = service.updateGraduateBaseInf(graduateID,name,ethnic,place,status);
        System.out.println(i);
        request.getRequestDispatcher("../forward/add_modify").forward(request,response);
    }

    //删除毕业生信息
    @RequestMapping("delete/studentInf")
    @ResponseBody
    public String deleteGraduateBaseInf(String graduateID){
        int i = service.deleteGraduateBaseInf(graduateID);
        System.out.println(i);
        return "studentIndex.jsp";
    }
}
