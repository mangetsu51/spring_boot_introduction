package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.EmployeeService;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.entity.Employee;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	private final EmployeeService employeeService;
	
	@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
	
	@GetMapping("/list")
    public String showList(Model model) {
        // Serviceを呼び出し、Model属性にセットします
        List<Employee> employees = this.employeeService.findAllEmployee();
        model.addAttribute("employees", employees);
        return "employee/list";
    }
}
