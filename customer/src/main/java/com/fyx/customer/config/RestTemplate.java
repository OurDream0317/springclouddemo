package com.fyx.customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //加载到配置中心
public class RestTemplate {


    @Bean
    @LoadBalanced//启用负载均衡
    public org.springframework.web.client.RestTemplate createRestTemplate(){
        return new org.springframework.web.client.RestTemplate();
    }
}
