/*
 * Copyright (C) 2009-2017 Hangzhou 2Dfire Technology Co., Ltd.All rights reserved
 */
package com.example.demo.Controller;

/**
 * MovieController
 *
 * @author lilu
 * @since 2018-02-06
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 看电影相关
 */
@RestController
public class MovieController {

    @RequestMapping
    public String watchingMovie(){

        return "Go to a movie！";
    }


}