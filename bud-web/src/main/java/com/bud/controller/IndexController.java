package com.bud.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-16
 */
@RestController
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping({"/","/index"})
    public String index(){
        logger.info("index");
        return "index";
    }
}
