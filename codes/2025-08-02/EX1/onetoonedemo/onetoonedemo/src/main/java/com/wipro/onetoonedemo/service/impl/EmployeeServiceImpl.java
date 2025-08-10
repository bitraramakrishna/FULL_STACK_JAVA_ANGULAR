package com.wipro.onetoonedemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.onetoonedemo.entity.Employee;
import com.wipro.onetoonedemo.repo.EmployeeRepo;
import com.wipro.onetoonedemo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo userRepo;
	
	@Override
	public void save(Employee employee) {
		userRepo.save(employee);

	}

	@Override
	public List<Employee> findAll() {
		 
		return userRepo.findAll();
	}

}
