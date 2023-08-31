package com.graduate.controller;

import com.graduate.enity.GraduateBaseInf;
import com.graduate.enity.GraduateEmploymentInf;
import com.graduate.enity.User;
import com.graduate.service.AdminGraduateBaseInfService;
import com.graduate.service.GraduateEmploymentInfService;
import com.graduate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@Controller
public class AdminController {

    @Resource
    AdminGraduateBaseInfService service;

    @Resource
    UserService userService;

    @Resource
    GraduateEmploymentInfService employmentInfService;

    //转发添加修改就业信息页面
    @RequestMapping("/forward/admin_add_employ")
    public String forwardAddEmploy(){
        return "admin_modify_and_addEmployInf.html";
    }
    //转发指定查询就业信息页面
    @RequestMapping("/forward/admin_find_employ")
    public String forwardFindEmploy(){
        return "admin_research.html";
    }
    //转发
    @RequestMapping("/forward/all")
    public String forwardSelectAll(){
        return "research.html";
    }
    //转发
    @RequestMapping("/forward/user")
    public String forwardUserPage(){
        return "user_manage.html";
    }
    //查询用户
    @RequestMapping("/select/user")
    @ResponseBody
    public Map<Integer,Map<String,Object>> selectUser(){
        Map<Integer,Map<String,Object>> userList = userService.selectUserList();
        System.out.println(userList);
        return userList;
    }

    //用户搜索框查询用户
    @RequestMapping("/find/user")
    @ResponseBody
    public Map<String,Object>  findUser(String graduateID){
        Integer account = new Integer(graduateID);
        Map<String, Object> user = userService.findUser(account);
        return user;
    }

    //管理用户修改密码
    @RequestMapping("/update/userpwd")
    @ResponseBody
    public void updatePwd(Integer id,String password,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        Integer account = new Integer(id);
        int i = userService.updatePwd(account, password);
        System.out.println(i);
        request.getRequestDispatcher("../forward/user").forward(request,response);
    }

        //查询部分
        @RequestMapping("/select/portion")
        @ResponseBody
        public List<GraduateBaseInf> selectPortion(HttpServletResponse response){
            List<GraduateBaseInf> selectPortion = service.selectPortion();
            System.out.println(selectPortion);
            return selectPortion;
        }

    //查询指定
    @RequestMapping("/select/specify")
    @ResponseBody
    public GraduateBaseInf selectSpecify(String id){
        Integer graduateID = new Integer(id);
        System.out.println(id);
        GraduateBaseInf selectSpecify = service.selectSpecify(graduateID);
        System.out.println(selectSpecify);
        return selectSpecify;
    }

    @RequestMapping("/forward/adminupdateBase")
    public String forwardUpdateBaseInf(){
        return "admin_modify_and_addBaseInf.html";
    }

    //管理员修改学生基本信息
    @RequestMapping("/admin/updateBase")
    @ResponseBody
    public void updateStudentBaserInf(Integer id, String name, String ethnic, String place, String professional, String status, HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        Integer graduateID = new Integer(id);
        service.updateGraduateBaseInf(graduateID, name, ethnic, place, professional, status);
        request.getRequestDispatcher("../forward/add_modify").forward(request,response);
    }

    //跳转查询就业页面
    @RequestMapping("/forward/selectIsEmploy")
    public String forwardFindIsEmploy(){
        return "already_employ.html";
    }

    //指定查询已经就业人
    @RequestMapping("/find/already_employ")
    @ResponseBody
    public Map<String,Object> findAlreadyEmploy(String id){
        Integer graduateID = new Integer(id);
        Map<String, Object> employStudentInf = employmentInfService.selectIsEmployStudentInf(graduateID);
        System.out.println(employStudentInf == null);
        if (employStudentInf == null) {
            Map<String,Object> map = new HashMap<>();
            map.put("status", "false");
            employStudentInf = map;
            Set<String> strings = employStudentInf.keySet();
            Iterator<String> iterator = strings.iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();//找出迭代器中的每一个键
                Object value = employStudentInf.get(key);//通过键找出相应的值
                System.out.println(key + "\t" + value);
            }
        }
        System.out.println(employStudentInf);
        return employStudentInf;
    }

    //跳转指定查询未就业人员信息
    @RequestMapping("/forward/noEmployInf")
    public String forwardNoEmploy(){
        return "noEmploy.html";
    }

    //数据库返回所有未就业人员信息
    @RequestMapping("/find/returnNoEmploy")
    @ResponseBody
    public List<GraduateBaseInf> returnNoEmployInfo(){
        List<GraduateBaseInf> noEmployStudentInf = employmentInfService.selectNoEmployStudentInf();
        System.out.println(noEmployStudentInf);
        return noEmployStudentInf;
    }

    //把会话中的id移除
    @RequestMapping("/remove/admin_log_out")
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
