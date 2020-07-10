package com.mystudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OrderController {
    @RequestMapping("/buyCar")
    @ResponseBody
    public String buyCar() {
        System.out.println("========buyCar========");
        return "suuccess";
    }

    @RequestMapping("/buyCar2")
    @ResponseBody
    public Map<String,Object> buyCar2() {
        System.out.println("========buyCar2========");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key", "value");
        return map;
    }
}
