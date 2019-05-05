package com.example.demo;

import com.example.demo.free.webservice.client.ArrayOfString;
import com.example.demo.free.webservice.client.WeatherWebService;
import com.example.demo.free.webservice.client.WeatherWebServiceSoap;
import com.example.demo.webservice.client.WebserviceDemoService_Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ConditionalOnClass()
public class DemoApplicationTests {

    /**
     *
     * @Description:调用自己的webservice接口
     * @auther: xu.liu
     * @date: 2019/4/30 18:08
     * @param: []
     * @return: void
     *
     */
    @Test
    public void contextLoads() {
        WebserviceDemoService_Service webServiceImpl = new WebserviceDemoService_Service();
        String result = webServiceImpl.getWebserviceDemoServiceImplPort().sayHello("什么都没有说");
        System.out.println("===========================================");
        System.out.println(result);
        System.out.println("===========================================");
    }

    /**
     *
     * @Description:调用外部免费的webservice接口
     * @auther: xu.liu
     * @date: 2019/4/30 17:18
     * @param: []
     * @return: void
     *
     */
    @Test
    public void weatherQuery(){
        //new一个查询的类
        WeatherWebService weatherWs = new WeatherWebService();
        //返回一个服务器端的接口,即代理对象
        WeatherWebServiceSoap weatherWsSoap = weatherWs.getWeatherWebServiceSoap();
        //代理对象中的一个通过地址查询天气的方法
        ArrayOfString weather = weatherWsSoap.getWeatherbyCityName("北京");
        //ArrayOfString相当于一个工厂，其对象中封装了一个List，也就是天气详细信息
        List<String> list = weather.getString();
        System.out.println(list);
        //也可foreach，（内置key value的形式展示信息）
        for (String string : list) {
            System.out.println(string+"======");
        }

    }



}
