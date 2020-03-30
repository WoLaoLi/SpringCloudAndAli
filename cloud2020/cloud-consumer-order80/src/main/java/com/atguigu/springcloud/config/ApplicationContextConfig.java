package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2020/3/7
 * @description :
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced  //使用这个注解 赋予resttemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
