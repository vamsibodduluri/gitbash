package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/EmployeeSave")
	public EmployeeEntity saveInfo(@RequestBody EmployeeEntity employeeEntity) {
		return empService.saveEmpInfo(employeeEntity);
		
	}

}
