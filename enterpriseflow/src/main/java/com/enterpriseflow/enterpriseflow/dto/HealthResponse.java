package com.enterpriseflow.enterpriseflow.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
public class HealthResponse {
    String status;
    String application;

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public HealthResponse(String status, String application){
        this.status=status;
        this.application=application;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
