package com.kb.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @Author: kb
 * @Date: 2019-10-31 16:30
 */
@RestController
public class ExceptionController {
    @GetMapping("/exce")
    public String showInfo() {
        System.err.println("dddddddddddddd");
        String info = "你好";
        int a = 1 / 0;
        return info;
    }


}
