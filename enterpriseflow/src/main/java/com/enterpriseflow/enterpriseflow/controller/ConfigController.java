package com.enterpriseflow.enterpriseflow.controller;

import com.enterpriseflow.enterpriseflow.dto.ConfigResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    private final ConfigResponse configResponse;

    @Autowired
    public ConfigController(ConfigResponse configResponse){
        this.configResponse=configResponse;
    }
    @GetMapping("/api/v1/config")
    public ConfigResponse getResponse(){
        return configResponse;
    }
}
