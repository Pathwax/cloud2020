package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamKafkaMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaMain8803.class,args);
    }
}
