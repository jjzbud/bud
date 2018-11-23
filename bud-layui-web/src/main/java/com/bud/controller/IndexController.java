package com.bud.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @Author jiejz1
 * @Create 2018-11-16
 */
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping({"/","/index"})
    public String indexNew(){
        logger.info("index");
        return "index";
    }

//    @RequestMapping("indexNew")
//    public String index(){
//        logger.info("index_new");
//        return "index_new";
//    }
}
