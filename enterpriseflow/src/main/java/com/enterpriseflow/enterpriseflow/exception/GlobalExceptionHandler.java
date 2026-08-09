package com.enterpriseflow.enterpriseflow.exception;

import com.enterpriseflow.enterpriseflow.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = NoSuchRouteException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody com.enterpriseflow.enterpriseflow.dto.ErrorResponse handleException(NoSuchRouteException ex){
        return new ErrorResponse(Instant.now(), HttpStatus.NOT_FOUND.value(), "Not Found",ex.getMessage(), "/api/v1/error-response");

    }

    @ExceptionHandler(value = NoSuchEmployeeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody com.enterpriseflow.enterpriseflow.dto.ErrorResponse handleEmployee(NoSuchEmployeeException ex){
        return new ErrorResponse(ex.getMessage());
    }
}
