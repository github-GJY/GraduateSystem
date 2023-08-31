package com.graduate.dao;

import com.graduate.enity.GraduateBaseInf;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AdminGraduateBaseInfDao {
    //查询所有毕业生信息
    List<GraduateBaseInf> selectPortion();

    //指定学生查询
    GraduateBaseInf selectSpecify(Integer graduateID);

    //管理员修改学生基本信息
    int updateGraduateBaseInf(@Param("graduateID") Integer graduateID,@Param("name") String name, @Param("ethnic") String ethnic,
                              @Param("place") String place, @Param("professional")String professional, @Param("status") String status);
}
