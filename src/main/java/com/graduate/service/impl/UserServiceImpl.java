package com.graduate.service.impl;

import com.graduate.dao.UserDao;
import com.graduate.enity.Admin;
import com.graduate.enity.User;
import com.graduate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public User selectUser(Integer account, String password) {
        return dao.selectUser(account,password);
    }

    @Override
    public Admin selectAdmin(Integer account, String password) {
        return dao.selectAdmin(account, password);
    }

    @Override
    public Map<Integer,Map<String,Object>> selectUserList() {
        return dao.selectUserList();
    }

    @Override
    public int updatePwd(Integer account, String password) {
        return dao.updatePwd(account,password);
    }

    @Override
    public Map<String,Object>  findUser(Integer account) {
        return dao.findUser(account);
    }

    @Override
    public int insertAccount(Integer account) {
        return dao.insertAccount(account);
    }

    @Override
    public User selectUser2(Integer graduateID, String newPwd) {
        return dao.selectUser2(graduateID, newPwd);
    }

    @Override
    public int updatePwd2(Integer graduateID, String newPwd) {
        return dao.updatePwd2(graduateID, newPwd);
    }

    @Override
    public User selectUserAccount(Integer graduateID) {
        return dao.selectUserAccount(graduateID);
    }
}
