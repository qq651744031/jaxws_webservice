package com.sf.test;

import com.sf.service.impl.DemoServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/***
 * Author：HonLin.Lee
 * Date：2019/1/17 0:45
 * Description:
 ***/
public class DemoWebServiceTest {
    public static void main(String[] args) {

        //1.发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        //2.设置服务地址
        factory.setAddress("http://localhost:8010/ws/hello?wsdl");

        //3.设置服务类
        factory.setServiceBean(new DemoServiceImpl());
        //3.2日志打印
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //4.发布服务
        factory.create();

        System.out.println("---发布服务成功，端口8010......");

    }
}
