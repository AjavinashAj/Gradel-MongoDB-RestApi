package com.dakr.repository;

import com.dakr.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee ,String> {

    // customized method

    public List<Employee> getAllByEmployeeName(String name);

    @Override
    void deleteById(String s);
}
