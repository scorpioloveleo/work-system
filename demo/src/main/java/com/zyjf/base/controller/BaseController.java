package com.zyjf.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Autohor: scorpio
 * @Description:
 * @Date: Created in 2018/9/17 0017 下午 15:19
 * @Modified By:
 */

@RestController
public class BaseController {

    @GetMapping("test")
    public String hhh(){
        return "Hello";
    }

}
