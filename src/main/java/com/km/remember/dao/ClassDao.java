package com.km.remember.dao;

import com.km.remember.domain.ClassInfo;
import com.km.remember.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ClassDao {

    @Select("select * from classInfo where classid = #{classId}")
    public ClassInfo getClassInfo(String classId);
}
