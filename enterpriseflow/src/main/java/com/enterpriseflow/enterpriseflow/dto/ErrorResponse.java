package com.enterpriseflow.enterpriseflow.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.Instant;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {
    Instant instant;
    Integer status;
    String error;
    String message;
    String path;

    public ErrorResponse(Instant instant, Integer status, String error, String message,String path) {
        this.instant = instant;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public ErrorResponse(String message){
        this.message=message;
    }
}
