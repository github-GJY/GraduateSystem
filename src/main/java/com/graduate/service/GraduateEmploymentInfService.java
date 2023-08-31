package com.graduate.service;

import com.graduate.enity.GraduateBaseInf;
import com.graduate.enity.GraduateEmploymentInf;
import com.graduate.enity.ProfessionalNumber;
import com.graduate.enity.StudentEmployAndName;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GraduateEmploymentInfService {
    //查询毕业生就业信息
    GraduateEmploymentInf selectGraduateEmploymentInf(Integer graduateID);
//    插入毕业生就业信息
    int insertGraduateEmploymentInf( Integer graduateID, String worktime, String workplace,
                                   String worknature,  String duties,  String address);
    //修改毕业生就业信息
    int updateGraduateEmploymentInf(Integer graduateID,Date worktime,  String workplace,
                                    String worknature,  String duties,  String address);
    //删除毕业生就业信息
    int deleteGraduateEmploymentInf( Integer graduateID);
    //查询是否已就业学生信息
    Map<String,Object> selectIsEmployStudentInf(Integer graduateID);

    //查询就业学生人数
    List<GraduateEmploymentInf> findEmploy();

    //查询学生信息表中所有的专业
    List<ProfessionalNumber> finAllProfessional();

    //查询学生信息表中所有的专业但是已经就业的人数
    List<ProfessionalNumber> findAllEmployProfessional();

    //查询是否已就业学生信息
    List<GraduateBaseInf> selectNoEmployStudentInf();

    //查询学生自己的就业信息
    StudentEmployAndName selectStudentEmployInf(Integer graduateID );

    //学生更新自己就业信息
    int updateStudentEmployInf(Integer graduateID,String worktime, String workplace,
                               String worknature,String duties,
                              String address);
}
