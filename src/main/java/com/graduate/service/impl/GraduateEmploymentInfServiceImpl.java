package com.graduate.service.impl;

import com.graduate.dao.GraduateEmploymentInfDao;
import com.graduate.enity.GraduateBaseInf;
import com.graduate.enity.GraduateEmploymentInf;
import com.graduate.enity.ProfessionalNumber;
import com.graduate.enity.StudentEmployAndName;
import com.graduate.service.GraduateEmploymentInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class GraduateEmploymentInfServiceImpl implements GraduateEmploymentInfService {

    @Autowired
    private GraduateEmploymentInfDao dao;

    @Override
    public GraduateEmploymentInf selectGraduateEmploymentInf(Integer graduateID) {
        return dao.selectGraduateEmploymentInf(graduateID);
    }

    @Override
    public int insertGraduateEmploymentInf(Integer graduateID, String worktime, String workplace, String worknature, String duties, String address) {
        return dao.insertGraduateEmploymentInf(graduateID, worktime, workplace, worknature, duties, address);
    }

    @Override
    public int updateGraduateEmploymentInf(Integer graduateID, Date worktime, String workplace, String worknature, String duties, String address) {
        return dao.updateGraduateEmploymentInf(graduateID, worktime, workplace, worknature, duties, address);
    }

    @Override
    public int deleteGraduateEmploymentInf(Integer graduateID) {
        return dao.deleteGraduateEmploymentInf(graduateID);
    }

    @Override
    public Map<String,Object> selectIsEmployStudentInf(Integer graduateID) {
        return dao.selectIsEmployStudentInf(graduateID);
    }

    @Override
    public List<GraduateEmploymentInf> findEmploy() {
        return dao.findEmploy();
    }

    //查询学生信息表中所有的专业

    @Override
    public List<ProfessionalNumber> finAllProfessional() {
        return dao.finAllProfessional();
    }

    //查询学生信息表中所有的专业但是已经就业的人数
    @Override
    public List<ProfessionalNumber> findAllEmployProfessional() {
        return dao.findAllEmployProfessional();
    }

    @Override
    public List<GraduateBaseInf> selectNoEmployStudentInf() {
        return dao.selectNoEmployStudentInf();
    }

    @Override
    public StudentEmployAndName selectStudentEmployInf(Integer graduateID) {
        return dao.selectStudentEmployInf(graduateID);
    }

    @Override
    public int updateStudentEmployInf(Integer graduateID,String worktime, String workplace, String worknature, String duties, String address) {
        return dao.updateStudentEmployInf(graduateID,worktime, workplace, worknature, duties, address);
    }
}
