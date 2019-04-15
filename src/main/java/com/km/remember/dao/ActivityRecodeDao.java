package com.km.remember.dao;

import com.km.remember.domain.ActivityRecode;
import com.km.remember.domain.ClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ActivityRecodeDao {

    @Select("select * from ActivityRecode")
    public List<ActivityRecode> getAllClassesActivityRecodes();

    @Select("select * from ActivityRecode where classid = #{classId}")
    public List<ActivityRecode> getClassesActivityRecodes(String classId);
}
