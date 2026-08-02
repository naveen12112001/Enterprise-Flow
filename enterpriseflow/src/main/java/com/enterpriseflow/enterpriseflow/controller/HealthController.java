package com.enterpriseflow.enterpriseflow.controller;
import com.enterpriseflow.enterpriseflow.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerResponse;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public HealthResponse getHealth(){
        return new HealthResponse("UP","Enterprise Workflow");
    }
}
