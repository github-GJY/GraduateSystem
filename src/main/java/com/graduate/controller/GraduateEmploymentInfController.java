package com.graduate.controller;

import com.graduate.enity.*;
import com.graduate.service.GraduateBaseInfService;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class GraduateEmploymentInfController {

    @Resource
    private GraduateEmploymentInfService service;

    @Resource
    private GraduateBaseInfService baseInfService;

    @Resource
    private UserService userService;

    //查询毕业生就业信息(学生跳转)
    @RequestMapping("/forward/own_employ")
    public String forwardPwnEmploy() {
        return "studentemployInf.html";
    }

    //统计图(跳转)
    @RequestMapping("/forward/chartcount")
    public String forwardChart() {
        return "count_chart.html";
    }

    //查询就业学生人数
    @RequestMapping("/find/countemploy")
    @ResponseBody
    public List findCountEmploy() {
        List<GraduateEmploymentInf> employList = service.findEmploy();
        List<GraduateBaseInf> baseInfList = baseInfService.selectGraduateBaseInf();
        int noEmploy = baseInfList.size() - employList.size();
        int employ = baseInfList.size();
        List<ProfessionalNumber> allProfessional = service.finAllProfessional();
        List<ProfessionalNumber> allEmployProfessional = service.findAllEmployProfessional();
        System.out.println("1" + allEmployProfessional);
        System.out.println("2" + allProfessional);
        List list = new ArrayList();
        list.add(employ);
        list.add(noEmploy);
        list.add(allProfessional);
        list.add(allEmployProfessional);
        return list;
    }

    /* //查询所有各个专业总人数,以及已经就业的人数
     @RequestMapping("/find/every_professional")
     @ResponseBody
     public List<ProfessionalNumber> findEveryProfessional(){
         return list;
     }
 */
    //查询学生信息表中所有的专业但是已经就业的人数
    @RequestMapping("/find/finAllEmployProfessional")
    public List<ProfessionalNumber> finAllEmployProfessional() {
        return null;
    }


    //跳转修改就业信息页面
    @RequestMapping("/forward/modifyEmploy_student")
    public String forwardModifyStudentEmploy() {
        return "modify_employ.html";
    }

    @RequestMapping("/find/student_own_employInf")
    @ResponseBody
    public StudentEmployAndName findStudentOwnEmployInf(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object id = session.getAttribute("graduateID");
        Integer graduateID = (Integer) id;
        StudentEmployAndName studentEmployAndName = service.selectStudentEmployInf(graduateID);
        return studentEmployAndName;
    }

    //查询毕业生就业信息(学生)
    @RequestMapping("/select/student_employ")
    @ResponseBody
    public GraduateEmploymentInf selectOwnEmployInf(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object id = session.getAttribute("graduateID");
        Integer graduateID = (Integer) id;
        GraduateEmploymentInf ownEmployInf = service.selectGraduateEmploymentInf(graduateID);
        System.out.println(ownEmployInf);
        return ownEmployInf;
    }

    //查询毕业生就业信息(管理员)
    @RequestMapping("/select/employmentInf")
    @ResponseBody
    public Map<String, Object> selectGraduateEmploymentInf(String id) {
        Integer graduateID = new Integer(id);
        Map<String, Object> employmentInf = service.selectIsEmployStudentInf(graduateID);
        System.out.println(employmentInf);
        return employmentInf;
    }

    //更新学生个人就业信息
    @RequestMapping("/update/employ_inf_student")
    @ResponseBody
    public void updateStudentEmployInf(String id, String worktime, String workplace, String worknature, String duties, String address, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer graduateID = new Integer(id);
        service.updateStudentEmployInf(graduateID, worktime, workplace, worknature, duties, address);
        request.getRequestDispatcher("../forward/modifyEmploy_student").forward(request, response);
    }

    //插入毕业生就业信息
    @RequestMapping("/insert/employmentInf")
    public void insertGraduateEmploymentInf(String id, String worktime, String workplace, String worknature, String duties, String address, HttpServletResponse response,HttpServletRequest request) throws IOException, ServletException {
        Integer graduateID = new Integer(id);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        User user = userService.selectUserAccount(graduateID);
        PrintWriter out = null;
        out = response.getWriter();
        if (user != null) {
            int i = service.insertGraduateEmploymentInf(graduateID, worktime, workplace, worknature, duties, address);
            System.out.println(i);
        }else {
            out.print("<script>" +
                    "alert('请先添加学生基本信息');window.location.href = 'http://localhost:8080/GraduateManageSystem/forward/admin_add_employ';" +
                    "</script>");
        }
        out.print("<script>" +
                "alert('添加成功');window.location.href = 'http://localhost:8080/GraduateManageSystem/forward/modifyEmploy_student" +
                "</script>");
    }

    //修改毕业生就业信息
    @RequestMapping("/update/employmentInf")
    @ResponseBody
    public void updateGraduateEmploymentInf(Integer graduateID, Date worktime, String workplace,
                                            String worknature, String duties, String address) {
        int i = service.updateGraduateEmploymentInf(graduateID, worktime, workplace, worknature, duties, address);
        System.out.println(i);
    }

    //删除毕业生就业信息
    @RequestMapping("/delete/employmentInf")
    @ResponseBody
    public void deleteGraduateEmploymentInf(Integer graduateID) {
        int i = service.deleteGraduateEmploymentInf(graduateID);
        System.out.println(i);
    }


}
