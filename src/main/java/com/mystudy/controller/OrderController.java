package com.mystudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @RequestMapping("/buyCar")
    @ResponseBody
    public String buyCar() {
        System.out.println("========buyCar========");
        return "suuccess";
    }
}
