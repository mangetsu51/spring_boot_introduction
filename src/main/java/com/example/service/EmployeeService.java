package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.EmployeeRepository;

import java.util.List;
import com.example.entity.Employee;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;
	
	@Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	
	public List<Employee> findAllEmployee() {
		return this.employeeRepository.findAll();
    }
}
