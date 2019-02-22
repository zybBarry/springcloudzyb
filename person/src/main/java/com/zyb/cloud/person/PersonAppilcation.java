package com.zyb.cloud.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Author: zyb
 * @Date: 2019/2/21 17:37
 */
@SpringBootApplication
@EnableEurekaClient
public class PersonAppilcation {
    public static void main(String[] args) {
        SpringApplication.run(PersonAppilcation.class);
    }
}
