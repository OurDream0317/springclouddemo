package com.fyx.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //表姐该类是一个Eureka客户端
@EnableHystrix  //启动熔断器
@EnableFeignClients  //优化http请求
public class CustomerApplication {


	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
}
