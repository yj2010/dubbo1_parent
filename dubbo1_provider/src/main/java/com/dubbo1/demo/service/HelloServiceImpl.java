package com.dubbo1.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created By IDEA
 *
 * @Author: YJ
 * @Date: 2020/2/8
 * @Time: 11:34
 **/
@Service(version = "1.0.0", timeout = 10000, interfaceClass = HelloService.class)     //com.dubbo.alibaba...表示可以远程调用
@Component  //创建对象
public class HelloServiceImpl implements HelloService {
 @Override
 public String getHw() {
  return "helloworld";
 }
}
