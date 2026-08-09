package com.enterpriseflow.enterpriseflow.controller;
import com.enterpriseflow.enterpriseflow.dto.CountResponse;
import com.enterpriseflow.enterpriseflow.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerResponse;

@RestController
public class HealthController {
    int count=0;
    @GetMapping("/api/v1/health")
    public HealthResponse getHealth(){
        count++;
        return new HealthResponse("UP","Enterprise Workflow");
    }

    @GetMapping("/api/v1/health/count")
    public CountResponse getCount(){
        return new CountResponse(this.count);
    }
}
