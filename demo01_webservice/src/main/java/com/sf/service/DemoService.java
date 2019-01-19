package com.sf.service;

import javax.jws.WebService;

/***
 * Author：HonLin.Lee
 * Date：2019/1/17 0:43
 * Description:
 ***/
@WebService
public interface DemoService {
    public String sayHello(String name,Integer age);
    public String getMessage(String who);
}
