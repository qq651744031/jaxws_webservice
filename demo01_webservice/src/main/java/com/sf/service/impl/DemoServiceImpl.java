package com.sf.service.impl;

import com.sf.service.DemoService;

/***
 * Author：HonLin.Lee
 * Date：2019/1/17 0:43
 * Description:
 ***/
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return name+" you are very good !";
    }
}
