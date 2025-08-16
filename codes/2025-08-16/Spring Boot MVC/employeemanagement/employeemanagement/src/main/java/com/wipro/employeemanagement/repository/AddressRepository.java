package com.wipro.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.employeemanagement.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
