package com.enterpriseflow.enterpriseflow.controller;


import com.enterpriseflow.enterpriseflow.service.EmployeeService;
import com.enterpriseflow.enterpriseflow.dto.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public List<EmployeeResponse> getAllEmployees(){
        return employeeService.getAll();
    }

    @PostMapping
    public EmployeeResponse postEmployee(@RequestBody EmployeeResponse employeeResponse){
        return employeeService.postOne(employeeResponse.getName(),employeeResponse.getDepartment());
    }
}
