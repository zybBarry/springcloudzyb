package com.zyb.cloud.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启feign客户端支持
@EnableCircuitBreaker //开启CircuitBreaker（断路器）的支持  @EnableHystruxDashboard可以开启控制台监控断路器运行情况
@EnableZuulProxy //开启网关代理
public class UiApplication {
	public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }
}
