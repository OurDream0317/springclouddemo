package com.fyx.customer.Controller;

import com.fyx.customer.POJO.Cities;
import com.fyx.customer.feign.FeignPorduct;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class CiitesController {

    @Autowired   //相当于httpclient
    private  RestTemplate restTemplate;

    @Autowired
    private  DiscoveryClient discoveryClient;

    @Autowired     //feign优化后的请求
    private FeignPorduct feignPorduct;


    @RequestMapping("/findCities/{ids}")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "ErrorCitiesbyid")//访问模块如果出错走哪一个方法
    public Cities  findCitiesbyid( @PathVariable("ids") Integer integer){
        return feignPorduct.findCitiesbyid(integer);
    }

    public Cities  ErrorCitiesbyid(Integer integer){
        return new Cities(1,"城市错误",null,null);
    }

}
