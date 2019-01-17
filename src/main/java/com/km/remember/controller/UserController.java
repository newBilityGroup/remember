package com.km.remember.controller;

import com.km.remember.domain.User;
import com.km.remember.service.UserService;
import io.lettuce.core.dynamic.annotation.Param;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login/{username}", method = RequestMethod.GET)
    public User login(@PathVariable String username) {
        User user = userService.login(username);
        if (user == null)
            return null;
        else
            return user;
    }

}
