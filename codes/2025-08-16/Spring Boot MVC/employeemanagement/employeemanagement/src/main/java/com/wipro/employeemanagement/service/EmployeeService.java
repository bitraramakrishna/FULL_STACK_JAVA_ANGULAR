package com.wipro.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.employeemanagement.entity.Address;
import com.wipro.employeemanagement.entity.Department;
import com.wipro.employeemanagement.entity.Employee;
import com.wipro.employeemanagement.repository.DepartmentRepository;
import com.wipro.employeemanagement.repository.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public List<Employee> searchByName(String name) {
        return employeeRepository.findByNameContainingIgnoreCase(name);
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id " + id));
    }

    @Transactional
    public Employee create(String name, String type, String deptName, Address address) {
        Employee e = new Employee();
        e.setName(name);
        e.setType(type);
        if (deptName != null && !deptName.isBlank()) {
            Department d = departmentRepository.findByName(deptName)
                    .orElseGet(() -> {
                        Department nd = new Department();
                        nd.setName(deptName);
                        return departmentRepository.save(nd);
                    });
            e.setDepartment(d);
        }
        e.setAddress(address);
        return employeeRepository.save(e);
    }

    @Transactional
    public Employee update(Long id, String name, String type, String deptName, Address address) {
        Employee e = findById(id);
        e.setName(name);
        e.setType(type);
        if (deptName != null && !deptName.isBlank()) {
            Department d = departmentRepository.findByName(deptName)
                    .orElseGet(() -> {
                        Department nd = new Department();
                        nd.setName(deptName);
                        return departmentRepository.save(nd);
                    });
            e.setDepartment(d);
        } else {
            e.setDepartment(null);
        }
        e.setAddress(address);
        return employeeRepository.save(e);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
