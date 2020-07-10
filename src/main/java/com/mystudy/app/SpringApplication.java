package com.mystudy.app;

import com.mystudy.servlet.IndexServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
    模拟SpringBoot启动
 **/
public class SpringApplication {
    public static void run() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(80);
        //添加上下文，标记项目为web项目
        tomcat.addWebapp("/mvc", "F:\\temp");
        tomcat.start();//启动tomcat
        tomcat.getServer().await();//维持tomcat服务，否则tomcat一启动就会关闭
    }
}
