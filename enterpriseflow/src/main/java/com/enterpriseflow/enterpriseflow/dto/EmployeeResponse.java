package com.enterpriseflow.enterpriseflow.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    int id;
    String name;
    String department;

    EmployeeResponse(String name,String department){
        this.name=name;
        this.department=department;
    }

}
