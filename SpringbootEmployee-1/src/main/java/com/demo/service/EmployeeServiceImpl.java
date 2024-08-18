package com.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeRepoDao;

    @Override
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employees = employeeRepoDao.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> getEmployee(long employeeId) {
        return employeeRepoDao.findById(employeeId)
                .map(employee -> new ResponseEntity<>(employee, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @Override
    public ResponseEntity<Employee> addEmployee(Employee employee) {
        Employee addedEmployee = employeeRepoDao.save(employee);
        return new ResponseEntity<>(addedEmployee, HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<Employee> updateEmployee(long employeeId, Employee employee) {
        if (employeeRepoDao.existsById(employeeId)) {
            employee.setId(employeeId);
            Employee updatedEmployee = employeeRepoDao.save(employee);
            return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



    @Override
    public ResponseEntity<HttpStatus> deleteEmployee(long employeeId) {
        if (employeeRepoDao.existsById(employeeId)) {
            employeeRepoDao.deleteById(employeeId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
