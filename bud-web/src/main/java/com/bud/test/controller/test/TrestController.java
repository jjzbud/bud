package com.bud.test.controller.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-07-26
 */
@RestController
@RequestMapping(value = "trest")
public class TrestController {

    @RequestMapping(value = "test")
    public String test() {
        return "test";
    }
}
