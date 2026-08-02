package com.enterpriseflow.enterpriseflow.controller;

import com.enterpriseflow.enterpriseflow.dto.InfoResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Value("${application.name}")
    String name;
    @Value("${application.version}")
    String version;
    @Value("${application.environment}")
    String environment;
    @GetMapping("/api/v1/info")
    public InfoResponse getInfo(){
        return new InfoResponse(name,version,environment);
    }
}
