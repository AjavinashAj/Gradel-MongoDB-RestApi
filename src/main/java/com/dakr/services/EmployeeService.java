package com.dakr.services;

import com.dakr.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    // create
    public Employee create(Employee employee);


    // get All
    public List<Employee> getAll();

    //get single employee by using id

    public Optional<Employee> getEmployeeById(String empId);

    //get employee using name

    public List<Employee> getAllByName(String name);

    //delete

    public String deleteEmp(String empId);

    //update

    public Employee updateEmp(Employee employee);
}
