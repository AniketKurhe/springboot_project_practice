package com.java.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.java.springboot.model.Employee;
import com.java.springboot.repository.EmployeeRepository;
import com.java.springboot.service.EmployeeService;
@Service
public class EmployeeServiceimpl implements EmployeeService{
  
	private EmployeeRepository employeeRepository;
		
	
	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}
