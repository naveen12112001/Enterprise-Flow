package com.enterpriseflow.enterpriseflow.controller;

import com.enterpriseflow.enterpriseflow.Employee;
import com.enterpriseflow.enterpriseflow.dto.DeleteResponse;
import com.enterpriseflow.enterpriseflow.dto.EmployeeRequest;
import com.enterpriseflow.enterpriseflow.service.EmployeeService;
import com.enterpriseflow.enterpriseflow.dto.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAll();
    }

    @PostMapping
    public ResponseEntity<EmployeeResponse> postEmployee(@RequestBody EmployeeRequest employeeRequest){
        employeeService.postOne(employeeRequest);
        EmployeeResponse employeeResponse = new EmployeeResponse(employeeRequest.getName(),employeeRequest.getDepartment());
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getById(@PathVariable int id){
        EmployeeResponse employee = employeeService.getOne(id);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeResponse> putById(@PathVariable int id, @RequestBody EmployeeRequest employeeRequest){
        employeeService.putOne(id,employeeRequest);
        EmployeeResponse employeeResponse = new EmployeeResponse(id,employeeRequest.getName(),employeeRequest.getDepartment());
        return new ResponseEntity<>(employeeResponse,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public DeleteResponse deleteById(@PathVariable int id){
        return employeeService.deleteOne(id);
    }
}
