package com.zyb.cloud.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zyb
 * @Date: 2019/2/21 18:06
 */
@SpringBootApplication
@EnableDiscoveryClient //@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
@RestController
public class SomeApplication {
    @Value("${my.message}") //通过config server配置文件注入
    private String message;

    @RequestMapping(value = "/getsome")
    public String getsome(){
        return message;
    }
    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class, args);
    }

}
