package com.ivoronline.springboot_autowired_interface_constructor.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImplementation implements MyServiceInterface {

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello";
  }

}
