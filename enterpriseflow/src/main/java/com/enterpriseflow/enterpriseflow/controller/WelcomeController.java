package com.enterpriseflow.enterpriseflow.controller;

import com.enterpriseflow.enterpriseflow.dto.WelcomeResponse;
import com.enterpriseflow.enterpriseflow.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping("/api/v1/welcome")
    public WelcomeResponse getWelcome(){
        return welcomeService.getMessage();
    }
}
