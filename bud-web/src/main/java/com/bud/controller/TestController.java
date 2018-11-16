package com.bud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-16
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("queryTest")
    public String queryTest() {
        return "queryTest";
    }
}
