package com.demo.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.demo.entity.Employee;

public interface EmployeeService {
    ResponseEntity<List<Employee>> getEmployees();
    ResponseEntity<Employee> getEmployee(long employeeId);
    ResponseEntity<Employee> addEmployee(Employee employee);
    ResponseEntity<Employee> updateEmployee(long employeeId, Employee employee);
    ResponseEntity<HttpStatus> deleteEmployee(long employeeId);
}