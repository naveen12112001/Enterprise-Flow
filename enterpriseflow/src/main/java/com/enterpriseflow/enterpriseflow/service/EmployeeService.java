package com.enterpriseflow.enterpriseflow.service;

import com.enterpriseflow.enterpriseflow.dto.EmployeeResponse;
import com.enterpriseflow.enterpriseflow.dto.ErrorResponse;
import com.enterpriseflow.enterpriseflow.exception.NoSuchEmployeeException;
import com.enterpriseflow.enterpriseflow.exception.NoSuchRouteException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private int counter=3;
    private final List<EmployeeResponse> employeeResponses = new ArrayList<>(
            List.of(new EmployeeResponse(1,"Naveen","HR"),
                    new EmployeeResponse(2,"Lakshita","Finance"),
                    new EmployeeResponse(3,"Parimala","Engineering")));
    public List<EmployeeResponse> getAll(){
        return employeeResponses;
    }
    public EmployeeResponse postOne(String name,String department){
        counter++;
        EmployeeResponse emp1 = new EmployeeResponse(counter,name,department);
        employeeResponses.add(emp1);
        return emp1;
    }
    public Object getOne(int id) {
        return employeeResponses.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .map(employee -> (Object) employee)
                .orElseGet(() -> {
                    return new ErrorResponse(null,null,null,"Employee not found",null );
                });
    }

}
