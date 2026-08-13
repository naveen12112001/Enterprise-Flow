package com.enterpriseflow.enterpriseflow.service;

import com.enterpriseflow.enterpriseflow.dto.DeleteResponse;
import com.enterpriseflow.enterpriseflow.dto.EmployeeResponse;
import com.enterpriseflow.enterpriseflow.exception.NoSuchEmployeeException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeResponse returnEmployee(int id, String message) {
        return employeeResponses.stream().filter(employee -> employee.getId() == id).findFirst().orElseThrow(() -> new NoSuchEmployeeException(message));
    }
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
        return returnEmployee(id, "No employee of this Id found!");
    }

    public EmployeeResponse putOne(int id, String name, String department) {
        EmployeeResponse response = returnEmployee(id, "Sorry! No such employee found to edit values");
        response.setName(name);
        response.setDepartment(department);
        return response;

    }

    public DeleteResponse deleteOne(int id) {
        EmployeeResponse employeeResponse = returnEmployee(id,"Employee Id:-"+id+" is not found");
        employeeResponses.remove(employeeResponse);
        return new DeleteResponse("User:- "+employeeResponse.getName() + " has been deleted successfully", "Success");

    }

}


