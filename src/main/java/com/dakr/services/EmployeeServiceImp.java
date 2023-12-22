package com.dakr.services;

import com.dakr.entity.Employee;
import com.dakr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(String empId) {
        return repository.findById(empId);
    }

    @Override
    public List<Employee> getAllByName(String name) {
        return repository.getAllByEmployeeName(name);
    }

    @Override
    public String deleteEmp(String empId) {
        repository.deleteById(empId);
        return empId+"deleted successfully....";
    }

    @Override
    public Employee updateEmp(Employee employee) {
        return repository.save(employee);
    }
}
