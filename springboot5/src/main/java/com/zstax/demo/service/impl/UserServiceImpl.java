package com.zstax.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zstax.demo.bean.User;
import com.zstax.demo.dao.IUserDao;
import com.zstax.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project Name:SpringbootDemo
 * Package Name:com.zstax.demo.service.impl
 * File Name:UserServiceImpl
 * Date:2018/1/5 0005 9:38
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public int insert(User user) {
        return iUserDao.insert(user);
    }

    @Override
    public List<User> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<User>list = iUserDao.selectAll();
        PageInfo<User> info = new PageInfo<>(list);
        return list;
    }
}
