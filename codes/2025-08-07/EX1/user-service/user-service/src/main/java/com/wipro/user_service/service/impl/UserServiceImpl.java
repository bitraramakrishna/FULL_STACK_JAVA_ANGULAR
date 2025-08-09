package com.wipro.user_service.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.user_service.dto.NotificationDTO;
import com.wipro.user_service.entity.User;
import com.wipro.user_service.repo.UserRepo;
import com.wipro.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    private final String NOTIFICATION_SERVICE_URL = "http://notification-service/notify";

    @Override
    public User createUser(User user) {
        User savedUser = userRepo.save(user);
        sendNotification(savedUser, "Created");
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public User updateUser(int id, User userDetails) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setUsername(userDetails.getUsername());
            user.setPassword(userDetails.getPassword());
            user.setAddress(userDetails.getAddress());
            User updatedUser = userRepo.save(user);
            sendNotification(updatedUser, "Updated");
            return updatedUser;
        } else {
            
            return null; 
        }
    }

    @Override
    public void deleteUser(int id) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            User deletedUser = userOptional.get();
            userRepo.deleteById(id);
            sendNotification(deletedUser, "Deleted");
        }
        
    }

    private void sendNotification(User user, String action) {
        try {
            NotificationDTO notificationDTO = new NotificationDTO(user, action);
            restTemplate.postForEntity(NOTIFICATION_SERVICE_URL, notificationDTO, String.class);
            System.out.println("Notification sent for user " + user.getUsername() + " with action " + action);
        } catch (Exception e) {
            System.err.println("Failed " + user.getUsername() + ": " + e.getMessage());
        }
    }
	

}
