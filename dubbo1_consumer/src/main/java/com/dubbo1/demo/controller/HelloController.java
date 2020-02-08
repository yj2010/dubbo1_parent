package com.dubbo1.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo1.demo.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created By IDEA
 *
 * @Author: YJ
 * @Date: 2020/2/8
 * @Time: 17:41
 **/
@Controller
public class HelloController {
// @Autowired  //引用本地spring容器中的bean对象
 @Reference(interfaceClass = HelloService.class,version = "1.0.0",check = false)
 private HelloService helloService;
  @RequestMapping("/getHw")
  @ResponseBody
 public String getHw(){
//   return "返回结果！";
   return helloService.getHw();
  }
}
