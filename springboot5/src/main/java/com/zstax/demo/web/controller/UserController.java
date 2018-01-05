package com.zstax.demo.web.controller;

import com.zstax.demo.bean.User;
import com.zstax.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Project Name:SpringbootDemo
 * Package Name:com.zstax.demo.web.controller
 * File Name:UserController
 * Date:2018/1/5 0005 9:37
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/user",method = RequestMethod.POST,produces = "application/json")
    public String insertUser(User user){
        int i = userServiceImpl.insert(user);
        return "添加成功:"+i+"记录";
    }

    @RequestMapping(value = "/user/{pageNo}/{pageSize}",method = RequestMethod.GET,produces = "application/json")
    public List<User> getUsers(@PathVariable("pageNo") int pageNo,@PathVariable("pageSize") int pageSize){
        return userServiceImpl.findByPage(pageNo,pageSize);
    }
}
