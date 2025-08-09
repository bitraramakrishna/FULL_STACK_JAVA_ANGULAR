package com.wipro.user_service.service;

import java.util.List;
import java.util.Optional;

import com.wipro.user_service.entity.User;

public interface UserService {
	User createUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(int id);
    User updateUser(int id, User userDetails);
    		void deleteUser(int id);
}
