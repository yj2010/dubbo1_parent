package com.dubbo1.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Dubbo1ConsumerApplication {

 public static void main(String[] args) {
  SpringApplication.run(Dubbo1ConsumerApplication.class, args);
 }

}
