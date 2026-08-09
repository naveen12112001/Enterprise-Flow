package com.enterpriseflow.enterpriseflow.dto;


import lombok.Data;

import java.time.Instant;

@Data
public class ErrorResponse {
    Instant instant;
    int status;
    String error;
    String message;
    String path;

    public ErrorResponse(Instant instant, int status, String error, String message,String path) {
        this.instant = instant;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
