package com.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
