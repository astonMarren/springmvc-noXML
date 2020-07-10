package com.mystudy.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/mvc",name="IndexServlet2")
public class IndexServlet2 extends HttpServlet {

    public IndexServlet2() {
        System.out.println("====IndexServlet2 Construct======");
    }

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
