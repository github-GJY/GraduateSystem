package com.graduate.service;

import com.graduate.enity.GraduateBaseInf;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GraduateBaseInfService {
    //查询毕业生基本信息
    List<GraduateBaseInf> selectGraduateBaseInf();
    //插入毕业生基本信息
    int insertGraduateBaseInf(Integer graduateID, String name, String gender, String ethnic,
                              String place, String graduateTime,String professional, String status);
    //添加基本信息时添加学生账号
    int insertStudentAccount();
    //修改毕业生信息
    int updateGraduateBaseInf(Integer graduateID,String name,String ethnic,
                              String place,String status);
    //删除毕业生信息
    int deleteGraduateBaseInf(String graduateID);

    //查询学生个人基本信息
    GraduateBaseInf findOwnStudentInf(Integer graduateID);


}
