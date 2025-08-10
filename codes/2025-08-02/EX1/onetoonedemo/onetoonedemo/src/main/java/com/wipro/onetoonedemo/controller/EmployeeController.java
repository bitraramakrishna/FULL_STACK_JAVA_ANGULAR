package com.wipro.onetoonedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.onetoonedemo.entity.Employee;
import com.wipro.onetoonedemo.repo.EmployeeRepo;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping
	void save(@RequestBody Employee employee)
	{
		employeeRepo.save(employee);
	}
	
	@GetMapping
	List<Employee> findAll()
	{
		return employeeRepo.findAll();
		
	}
	
	
	@GetMapping("/{id}")
	Employee findById(@PathVariable int id)
	{
		return employeeRepo.findById(id);
		
	}
	
	@PutMapping 
	void update(@RequestBody Employee employee)
	{
		employeeRepo.save(employee);
		
	}
	
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		employeeRepo.deleteById(id);
		
	}
	

}
