package com.mystudy.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 Servlet注册给容器三种方式：
 1、web.xml标签
 2、@WebServlet注解（Servlet3.0版本之上）
 3、容器的API
 **/
//@WebServlet
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("====doGet====");
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("====doPost====");
    }
}
