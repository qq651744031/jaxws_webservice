package com.sf.test;

import com.sf.service.DemoService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/***
 * Author：HonLin.Lee
 * Date：2019/1/17 1:17
 * Description:
 ***/
public class DemoWebClientTest {
    public static void main(String[] args) {
        //1.创建cxf代理工程
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        //2.设置远程访问服务端地址
        factory.setAddress("http://localhost:8010/ws/hello?wsdl");
        //3.设置接口类型
        factory.setServiceClass(DemoService.class);
        //4.对接口生成代理对象
        DemoService demoService = factory.create(DemoService.class);
        //4.2代理对象
        System.out.println(demoService.getClass());
        //5.远程访问服务端方法
        String content = demoService.sayHello("Tom",28);

        System.out.println(content);
    }
}
