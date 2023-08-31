package com.graduate.service;

import com.graduate.enity.GraduateBaseInf;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AdminGraduateBaseInfService {
    //查询部分毕业生信息
    List<GraduateBaseInf> selectPortion();

    //指定学生查询
    GraduateBaseInf selectSpecify(Integer graduateID);

    //管理员修改学生基本信息
    int updateGraduateBaseInf(Integer graduateID, String name,String ethnic,
                              String place, String professional, String status);
}
