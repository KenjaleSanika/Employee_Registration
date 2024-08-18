package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
}
