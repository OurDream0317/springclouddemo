package com.fyx.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer  //表名当前项目是一个配置服务中心
@EnableEurekaClient//当前服务是一个客户端
public class SpringcloudconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigApplication.class, args);
	}
}
