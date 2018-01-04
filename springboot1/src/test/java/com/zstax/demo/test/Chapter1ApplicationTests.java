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
 * Date:2018/1/4 8:53
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
