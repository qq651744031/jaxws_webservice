package com.sf.service.impl;

import com.sf.service.DemoService;

import java.util.Date;

/***
 * Author：HonLin.Lee
 * Date：2019/1/17 0:43
 * Description:
 ***/
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name,Integer age) {
        return name+" you are very good !"+age+"years old !";
    }

    @Override
    public String getMessage(String who) {
        String s = new Date() + "---" + who + "---come here !";
        return s;
    }
}
