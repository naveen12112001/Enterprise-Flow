package com.enterpriseflow.enterpriseflow.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({ "id", "name", "department"})
public class EmployeeResponse {
    private int id;
    private String name;
    private String department;

    public EmployeeResponse(String name,String department){
        this.name=name;
        this.department=department;
    }

}
