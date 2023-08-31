package com.graduate.service.impl;

import com.graduate.dao.GraduateBaseInfDao;
import com.graduate.enity.GraduateBaseInf;
import com.graduate.service.GraduateBaseInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class GraduateBaseInfServiceImpl implements GraduateBaseInfService {

    @Autowired
    private GraduateBaseInfDao dao;

    //查询毕业生基本信息
    @Override
    public List<GraduateBaseInf> selectGraduateBaseInf() {
        return dao.selectGraduateBaseInf();
    }

    //插入毕业生信息
    @Override
    public int insertGraduateBaseInf(Integer graduateID, String name, String gender, String ethnic, String place, String graduatetime, String professional, String status) {
        return dao.insertGraduateBaseInf(graduateID, name, gender, ethnic, place, graduatetime, professional, status);
    }

    @Override
    public int insertStudentAccount() {
        return dao.insertStudentAccount();
    }

    //修改毕业生信息
    @Override
    public int updateGraduateBaseInf(Integer graduateID,String name, String ethnic,
                                     String place, String status) {
        return dao.updateGraduateBaseInf(graduateID,name, ethnic, place, status);
    }

    //删除毕业生信息

    @Override
    public int deleteGraduateBaseInf(String graduateID) {
        return dao.deleteGraduateBaseInf(graduateID);
    }

    //个人基本信息
    @Override
    public GraduateBaseInf findOwnStudentInf(Integer graduateID) {
        return dao.findOwnStudentInf(graduateID);
    }

}
