package com.enterpriseflow.enterpriseflow.service;
import com.enterpriseflow.enterpriseflow.Employee;
import com.enterpriseflow.enterpriseflow.dto.DeleteResponse;
import com.enterpriseflow.enterpriseflow.dto.EmployeeResponse;
import com.enterpriseflow.enterpriseflow.exception.NoSuchEmployeeException;
import com.enterpriseflow.enterpriseflow.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getOne(int id) {
        return employeeRepository.findById(id).orElseThrow(() -> new NoSuchEmployeeException("No employee of this Id found!"));
    }
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee postOne(String name, String department) {
        Employee employee = new Employee(name,department);
        employeeRepository.save(employee);
        return employee;
    }
    public Employee putOne(int id, String name, String department) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new NoSuchEmployeeException("Sorry! No such employee found to edit values"));
        employee.setName(name);
        employee.setDepartment(department);
        return employee;
    }
    public DeleteResponse deleteOne(int id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new NoSuchEmployeeException("Employee Id:-"+id+" is not found"));
        employeeRepository.delete(employee);
        return new DeleteResponse("User has been deleted successfully", "Success");

    }

}


