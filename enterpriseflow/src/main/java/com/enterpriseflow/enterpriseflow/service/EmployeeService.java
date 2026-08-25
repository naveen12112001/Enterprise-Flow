package com.enterpriseflow.enterpriseflow.service;
import com.enterpriseflow.enterpriseflow.Employee;
import com.enterpriseflow.enterpriseflow.dto.DeleteResponse;
import com.enterpriseflow.enterpriseflow.dto.EmployeeRequest;
import com.enterpriseflow.enterpriseflow.dto.EmployeeResponse;
import com.enterpriseflow.enterpriseflow.exception.NoSuchEmployeeException;
import com.enterpriseflow.enterpriseflow.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeResponse getOne(int id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new NoSuchEmployeeException("No employee of this Id found!"));
        return new EmployeeResponse(employee.getId(),employee.getName(),employee.getDepartment());
    }
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public EmployeeRequest postOne(int id,EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new NoSuchEmployeeException("No employee of this Id found!"));
        Employee employeeToBeAdded = new Employee(employeeRequest.getName(),employeeRequest.getDepartment());
        employeeRepository.save(employeeToBeAdded);
        return employeeRequest;
    }
    public EmployeeResponse putOne(EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.findById(employeeRequest.getId()).orElseThrow(()-> new NoSuchEmployeeException("Sorry! No such employee found to edit values"));
        employee.setName(employeeRequest.getName());
        employee.setDepartment(employeeRequest.getDepartment());
        return new EmployeeResponse(employee.getId(),employee.getName(),employee.getDepartment());
    }
    public DeleteResponse deleteOne(int id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new NoSuchEmployeeException("Employee Id:-"+id+" is not found"));
        employeeRepository.delete(employee);
        return new DeleteResponse("User has been deleted successfully", "Success");
    }


}


