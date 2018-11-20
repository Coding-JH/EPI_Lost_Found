package com.epi.controller;

import com.epi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserService userService;
//    @ResponseBody
//    @RequestMapping(value = )
//    public Msg login()
}
