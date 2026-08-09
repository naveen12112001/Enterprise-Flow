package com.enterpriseflow.enterpriseflow.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @RequestMapping("/hello")
    String getHello(){
        return "Inside Hello controller";
    }
}
