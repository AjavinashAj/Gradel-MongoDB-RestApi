package com.dakr.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
@Data
public class Employee {

    @Id
    private String employeeId;
    private String employeeName;
    private String employeeRole;
    private Double salary;
}
