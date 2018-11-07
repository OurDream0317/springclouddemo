package com.fyx.customer.feign;

import com.fyx.customer.POJO.Cities;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value ="product")//请求注册中心名是product开头的服务
public interface FeignPorduct {
    //表示请求的是product中requestMapping中"/showGoods/{ids}
    @RequestMapping(value = "/showGoods/{ids}",method = RequestMethod.GET)
    Cities   findCitiesbyid(@PathVariable("ids") Integer id);
}
