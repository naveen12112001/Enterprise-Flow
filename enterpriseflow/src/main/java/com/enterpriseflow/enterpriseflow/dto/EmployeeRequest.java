package com.enterpriseflow.enterpriseflow.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    int id;
    String name;
    String department;

    EmployeeRequest(String name,String department){
        this.name=name;
        this.department=department;
    }

}
