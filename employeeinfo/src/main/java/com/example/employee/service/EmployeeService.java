package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.EmployeeEntity;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository eRepo;
	
	public EmployeeEntity saveEmpInfo(EmployeeEntity employeeEntity) {
		return eRepo.save(employeeEntity);
	}

}
