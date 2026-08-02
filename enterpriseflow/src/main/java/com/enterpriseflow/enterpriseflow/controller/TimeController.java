package com.enterpriseflow.enterpriseflow.controller;

import com.enterpriseflow.enterpriseflow.dto.TimeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;

@RestController
public class TimeController {

    @GetMapping("/api/v1/time")
    TimeResponse getTime(){
        return new TimeResponse(Instant.now());
    }
}
