package com.cnpc.gundetails;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cnpc.gundetails.mapper*")

public class GunDetailsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GunDetailsServerApplication.class, args);
    }

}
