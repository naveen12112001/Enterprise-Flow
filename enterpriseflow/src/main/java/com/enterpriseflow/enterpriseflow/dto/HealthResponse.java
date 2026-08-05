package com.enterpriseflow.enterpriseflow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HealthResponse {
    String status;
    String application;
    public HealthResponse(String status, String application){
        this.status=status;
        this.application=application;
    }
}
