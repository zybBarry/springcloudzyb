package com.zyb.cloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: zyb
 * @Date: 2019/2/21 16:26
 */
@SpringBootApplication
@EnableEurekaServer//开启对EurekaServer的支持
public class DiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class,args);
    }
}
