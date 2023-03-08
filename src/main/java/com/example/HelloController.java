package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello(){
     return "hello-world";
    }
}
