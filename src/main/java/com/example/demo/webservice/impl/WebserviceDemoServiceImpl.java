package com.example.demo.webservice.impl;

import com.example.demo.webservice.WebserviceDemoService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @ClassName:WebserviceDemoServiceImpl
 * @Description: TODO
 * @Author: xu.liu
 * @Date:2019/4/30 15:24
 * @Version:V1.0
 **/
@Service
@WebService(serviceName = "WebserviceDemoService",// 与接口中指定的name一致
        targetNamespace = "http://webservice.demo.example.com",// 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.example.demo.webservice.WebserviceDemoService" // 接口地址
        )
public class WebserviceDemoServiceImpl implements WebserviceDemoService {

    @Override
    public String sayHello(String name) {
        return "hello "+ name;
    }
}