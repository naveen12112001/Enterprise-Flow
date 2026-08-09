package com.enterpriseflow.enterpriseflow.service;

import com.enterpriseflow.enterpriseflow.dto.WelcomeResponse;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
    public WelcomeResponse getMessage(){
        return new WelcomeResponse();
    }
}
