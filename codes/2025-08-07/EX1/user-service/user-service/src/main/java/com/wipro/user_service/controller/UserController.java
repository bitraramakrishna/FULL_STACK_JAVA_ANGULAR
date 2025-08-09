package com.wipro.user_service.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.user_service.entity.User;
import com.wipro.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	 @Autowired
	    private UserService userService; 

	    @PostMapping
	    public ResponseEntity<User> createUser( @RequestBody User user) {
	        User savedUser = userService.createUser(user);
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	    }

	    @GetMapping
	    public List<User> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable int id) {
	        Optional<User> user = userService.getUserById(id);
	        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
	                   .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User userDetails) {
	        User updatedUser = userService.updateUser(id, userDetails);
	        if (updatedUser != null) {
	            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<HttpStatus> deleteUser(@PathVariable int id) {
	        Optional<User> userOptional = userService.getUserById(id); 
	        if (userOptional.isPresent()) {
	            userService.deleteUser(id);
	            return new ResponseEntity<>(HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
}


