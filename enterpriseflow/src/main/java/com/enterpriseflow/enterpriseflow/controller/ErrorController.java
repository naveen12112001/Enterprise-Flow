package com.enterpriseflow.enterpriseflow.controller;

import com.enterpriseflow.enterpriseflow.dto.ErrorResponse;
import com.enterpriseflow.enterpriseflow.exception.NoSuchRouteException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class ErrorController {

    @GetMapping("/api/v1/error-response")
    @ExceptionHandler(value = NoSuchRouteException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse getError(NoSuchRouteException ex){
        return new ErrorResponse(Instant.now(), HttpStatus.NOT_FOUND.value(), "Not Found", ex.getMessage(),"/api/v1/error-response");
    }
}
