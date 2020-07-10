package com.mystudy.app;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;

/**
    tomcat启动的时候会自动执行所有实现了WebApplicationInitializer接口类的onStartup()方法
    SpringMVC利用这一点可以实现零配置
 **/
public class TestWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletCxt) {
        System.out.println("执行到了。。。。");
    }
}
