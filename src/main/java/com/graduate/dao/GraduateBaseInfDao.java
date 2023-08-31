package com.graduate.dao;

import com.graduate.enity.GraduateBaseInf;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GraduateBaseInfDao {
    //查询学生基本信息
    List<GraduateBaseInf> selectGraduateBaseInf();
    //插入毕业生信息
    int insertGraduateBaseInf(@Param("graduateID") Integer graduateID, @Param("name") String name, @Param("gender")String gender, @Param("ethnic") String ethnic,
                              @Param("place") String place, @Param("graduatetime") String graduatetime,@Param("professional")String professional, @Param("status") String status);

    //添加基本信息时添加学生账号
    int insertStudentAccount();
    //修改毕业生信息
    int updateGraduateBaseInf(@Param("graduateID") Integer graduateID,@Param("name") String name,@Param("ethnic") String ethnic,
                              @Param("place") String place,@Param("status") String status);
    //删除毕业生信息
    int deleteGraduateBaseInf(@Param("graduateID") String graduateID);
    //查询学生个人基本信息
    GraduateBaseInf findOwnStudentInf(@Param("graduateID") Integer graduateID);

}
