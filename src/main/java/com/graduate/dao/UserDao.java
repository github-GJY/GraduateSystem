package com.graduate.dao;

import com.graduate.enity.Admin;
import com.graduate.enity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {
   User selectUser(@Param("account")Integer account, @Param("password")String password);
   User selectUser2(@Param("graduateID")Integer graduateID, @Param("oldPwd")String newPwd);
    Admin selectAdmin(@Param("account")Integer account, @Param("password")String password);
    //查询用户集合
    @MapKey(value = "account")
    Map<Integer,Map<String,Object>> selectUserList();
    //管理员修改用户密码
    int updatePwd(@Param("account") Integer account,@Param("password") String password);
    int updatePwd2(@Param("graduateID") Integer graduateID,@Param("newPwd") String newPwd);
    //管理员查询用户
 Map<String,Object> findUser(@Param("account") Integer account);
 //添加用户和毕业生编号绑定
   int insertAccount(@Param("account")Integer account);
   User selectUserAccount(@Param("account")Integer account);
}
