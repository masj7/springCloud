package com.msj.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Auther: msj
 */
@EnableHystrix //开启 Hystrix 熔断机制的支持
@EnableEurekaClient //将此服务注册到Eureka服务注册中心
@MapperScan("com.msj.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8004_Hystrix {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8004_Hystrix.class, args);
    }

}
