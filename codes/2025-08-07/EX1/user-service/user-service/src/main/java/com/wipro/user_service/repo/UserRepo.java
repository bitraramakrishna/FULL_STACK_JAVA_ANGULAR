package com.wipro.user_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.user_service.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
