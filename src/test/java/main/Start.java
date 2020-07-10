package main;

import com.mystudy.servlet.IndexServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.junit.Test;

public class Start {
    @Test
    public void startProject() throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        //设置主机名
        //tomcat.setHostname("localhost");
        //设置端口
        tomcat.setPort(80);
        tomcat.start();//启动tomcat
        System.out.println("启动Tomcat");
        //tomcat存储自身信息的目录，比如日志等信息，根目录
        //tomcat.setBaseDir("F:\\temp");
        IndexServlet indexServlet = new IndexServlet();
        //项目访问路径
        Context context = tomcat.addWebapp("/mvc", "F:\\temp");
        tomcat.addServlet("/mvc","index",indexServlet);
        context.addServletMappingDecoded("/index.do", "index");

        tomcat.getServer().await();//维持tomcat服务，否则tomcat一启动就会关闭

    }
}
