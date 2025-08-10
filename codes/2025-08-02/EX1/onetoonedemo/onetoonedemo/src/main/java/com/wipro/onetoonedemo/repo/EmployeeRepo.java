package com.wipro.onetoonedemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.onetoonedemo.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
