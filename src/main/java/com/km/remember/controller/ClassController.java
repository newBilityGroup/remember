package com.km.remember.controller;

import com.km.remember.domain.ClassInfo;
import com.km.remember.domain.User;
import com.km.remember.service.ClassService;
import com.km.remember.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api
@Controller
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    ClassService classService;

    @ResponseBody
    @GetMapping(value = "/{classId}/info")
    @ApiOperation(value="传入班级编号，查询班级信息", notes="当数据库成功查询到对象后，返回该对象，否则返回null")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "classId", value = "班级编号", required = true, dataType = "String"),
    })
    public ClassInfo getClassInfo(String classId){
        return classService.getClassInfo(classId);
    }

}
