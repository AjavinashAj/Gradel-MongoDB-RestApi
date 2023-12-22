package com.dakr.controller;

import com.dakr.entity.Employee;
import com.dakr.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employees")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    //create
    @PostMapping("/save")
    public ResponseEntity<Employee> create(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.create(employee));
    }

    // for get All

    @GetMapping("/retriveAll")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok().body(employeeService.getAll());
    }

    // get emp by using emoId
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmpById(@PathVariable String id){
      return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
    }

    // get usimg empName

    @GetMapping("/name")
    public ResponseEntity<List<Employee>> getEmpByName(@RequestParam String name){
        return ResponseEntity.ok().body(employeeService.getAllByName(name));
    }

    //delete

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String empId){
        return  ResponseEntity.ok().body(employeeService.deleteEmp(empId));
    }

    // update

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee){
        return ResponseEntity.ok().body(employeeService.updateEmp(employee));
    }
}
