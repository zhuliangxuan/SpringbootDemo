package com.zstax.demo.service;

import com.zstax.demo.model.RedisModel;
import org.springframework.stereotype.Service;

/**
 * Project Name:SpringbootDemo
 * Package Name:com.zstax.demo.service
 * File Name:RedisServiceImpl
 * Date:2018/1/5 0005 15:10
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
@Service
public class RedisServiceImpl extends IRedisService<RedisModel> {
    private static final String REDIS_KEY = "TEST_REDIS_KEY";

    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }
}
