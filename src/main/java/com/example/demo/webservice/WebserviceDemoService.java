package com.example.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @ClassName:WebserviceDemoService
 * @Description: TODO
 * @Author: xu.liu
 * @Date:2019/4/30 15:21
 * @Version:V1.0
 **/
@WebService
public interface WebserviceDemoService {

    @WebMethod
    public String sayHello(@WebParam(name = "name")String name);

}
