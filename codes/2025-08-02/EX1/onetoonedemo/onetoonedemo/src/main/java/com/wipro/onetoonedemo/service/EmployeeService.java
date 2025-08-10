package com.wipro.onetoonedemo.service;

import java.util.List;

import com.wipro.onetoonedemo.entity.Employee;

public interface EmployeeService {
	void save(Employee employee);
	List<Employee> findAll();
	
}





