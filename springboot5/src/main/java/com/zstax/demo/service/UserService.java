package com.zstax.demo.service;

import com.zstax.demo.bean.User;

import java.util.List;

/**
 * Project Name:SpringbootDemo
 * Package Name:com.zstax.demo.service
 * File Name:UserService
 * Date:2018/1/5 0005 9:38
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
public interface UserService {

    int insert(User user);
    List<User> findByPage(int pageNo,int pageSize);
}
