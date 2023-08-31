package com.graduate.service.impl;

import com.graduate.dao.AdminGraduateBaseInfDao;
import com.graduate.enity.GraduateBaseInf;
import com.graduate.service.AdminGraduateBaseInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminGraduateBaseInfServiceImpl implements AdminGraduateBaseInfService{

    @Autowired
    AdminGraduateBaseInfDao dao;

    @Override
    public List<GraduateBaseInf> selectPortion() {
        return dao.selectPortion();
    }

    @Override
    public GraduateBaseInf selectSpecify(Integer graduateID) {
        return dao.selectSpecify(graduateID);
    }

    @Override
    public int updateGraduateBaseInf(Integer graduateID,String name, String ethnic, String place, String professional, String status) {
        return dao.updateGraduateBaseInf(graduateID,name, ethnic, place,  professional, status);
    }
}
