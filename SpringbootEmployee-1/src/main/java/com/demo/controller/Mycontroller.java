package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/employees")
public class Mycontroller {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") long id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }
}

