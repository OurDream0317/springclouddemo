package com.fyx.customer.config;

import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RestTemplateTest {


    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Test
    public void  test(){
        for (int a=1;a<=25;a++){
            ServiceInstance product = this.loadBalancerClient.choose("product");

            System.out.println(product.getHost());
        }
    }


}