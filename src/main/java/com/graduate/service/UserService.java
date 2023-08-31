package com.graduate.service;

import com.graduate.enity.Admin;
import com.graduate.enity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserService {
    User selectUser( Integer account,String password);

    User selectUser2(Integer graduateID,String newPwd);

    Admin selectAdmin(Integer account, String password);

    //查询用户集合

    Map<Integer,Map<String,Object>> selectUserList();

    //管理员修改用户密码
    int updatePwd(Integer account, String password);
    int updatePwd2( Integer graduateID,String newPwd);

    //管理员查询用户
    Map<String,Object>  findUser(Integer account);

    //添加用户和毕业生编号绑定
    int insertAccount(Integer account);
    User selectUserAccount(@Param("graduateID")Integer graduateID);
}
