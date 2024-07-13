package com.ivoronline.springboot_autowired_interface_constructor.controllers;

import com.ivoronline.springboot_autowired_interface_constructor.services.MyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  MyServiceInterface myService;

  //=======================================================================
  // CONSTRUCTOR
  //=======================================================================
  //@Autowired
  public MyController(MyServiceInterface myService) {
    System.out.println("MyController(MyService myService)");
    this.myService = myService;
  }

  //=======================================================================
  // HELLO
  //=======================================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    String result = myService.sayHello();
    return result;
  }

}
