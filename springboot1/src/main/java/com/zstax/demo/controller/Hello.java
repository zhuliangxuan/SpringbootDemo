package com.zstax.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/4 0004.
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String index(){
        return "hello,world";
    }
}
