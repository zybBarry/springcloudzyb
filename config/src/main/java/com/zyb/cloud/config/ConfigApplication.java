package com.zyb.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Author: zyb
 * @Date: 2019/2/21 16:53
 */
@SpringBootApplication
@EnableConfigServer //开启配置服务
@EnableEurekaClient //开启eureka clent服务
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
