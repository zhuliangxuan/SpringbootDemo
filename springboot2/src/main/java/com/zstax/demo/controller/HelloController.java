package com.zstax.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project Name:springboot1
 * Package Name:com.zstax.demo.controller
 * File Name:HelloController
 * Date:2018/1/4 0004 10:03
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

}
