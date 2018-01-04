# 一、springboot快速入门
## 1、创建项目
使用ieda：
file-new-project(modele)-spring iniliatizr-default url
选择项目坐标-选择项目文件位置
## 2、引入web模块
pom文件增加依赖
``` xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
## 3、编写HelloWorld
``` java
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
```
启动主程序，打开浏览器访问http://localhost:8080/hello，可以看到页面输出Hello World
## 4、编写单元测试用例
``` java
package com.zstax.demo.test;

import com.zstax.demo.controller.Hello;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Project Name:springboot1
 * Package Name:com.zstax.demo.test
 * File Name:Chapter1ApplicationTests
 * Date:2018/1/4 0004 8:53
 * company: zstax
 * Copyright (c) 2018, zhuliangxuan@zstax.com All Rights Reserved.
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter1ApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new Hello()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello,world")));
    }

}
```