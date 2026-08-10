package com.enterpriseflow.enterpriseflow.service;

import com.enterpriseflow.enterpriseflow.dto.EmployeeResponse;
import com.enterpriseflow.enterpriseflow.exception.NoSuchEmployeeException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private int counter = 3;
    private final List<EmployeeResponse> employeeResponses = new ArrayList<>(List.of(new EmployeeResponse(1, "Naveen", "HR"), new EmployeeResponse(2, "Lakshita", "Finance"), new EmployeeResponse(3, "Parimala", "Engineering")));

    public List<EmployeeResponse> getAll() {
        return employeeResponses;
    }

    public EmployeeResponse postOne(String name, String department) {
        counter++;
        EmployeeResponse emp1 = new EmployeeResponse(counter, name, department);
        employeeResponses.add(emp1);
        return emp1;
    }

    public EmployeeResponse getOne(int id) {
        return employeeResponses.stream().filter(employee -> employee.getId() == id).findFirst().orElseThrow(() -> new NoSuchEmployeeException("No Such Employee Found"));
    }

    public EmployeeResponse putOne(int id, String name, String department) {
        EmployeeResponse response = employeeResponses.stream().filter(employee -> employee.getId() == id).findFirst().orElseThrow(() -> new NoSuchEmployeeException(("No Such Employee found")));
        response.setName(name);
        response.setDepartment(department);
        return response;

    }

}


