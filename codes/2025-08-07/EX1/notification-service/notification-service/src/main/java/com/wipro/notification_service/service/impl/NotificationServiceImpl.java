package com.wipro.notification_service.service.impl;

import org.springframework.stereotype.Service;

import com.wipro.notification_service.service.NotificationService;
import com.wipro.notification_service.dto.NotificationDto;
@Service
public class NotificationServiceImpl implements NotificationService{
	@Override
    public void processNotification(NotificationDto notificationDto) {
        String username = notificationDto.getUser().getUsername();
        String action = notificationDto.getAction();

        System.out.println("User " + username + " information is " + action);
    }
}
