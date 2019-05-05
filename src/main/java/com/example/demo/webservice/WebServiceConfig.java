/*
package com.example.demo.webservice;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

*/
/**
 * @ClassName:WebServiceConfig
 * @Description: TODO
 * @Author: xu.liu
 * @Date:2019/4/30 15:30
 * @Version:V1.0
 **//*

@Configuration
public class WebServiceConfig {
    @Autowired
    private WebserviceDemoService webserviceDemoService;

    */
/**
     * 注入servlet  bean name不能dispatcherServlet 否则会覆盖dispatcherServlet
     * @return
     *//*

    @Bean(name = "cxfServlet")
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/webservice/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    */
/**
     * 注册WebServiceDemoService接口到webservice服务
     * @return
     *//*

    @Bean
    public Endpoint sweptPayEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), webserviceDemoService);
        endpoint.publish("/webservice");
        return endpoint;
    }

}*/
