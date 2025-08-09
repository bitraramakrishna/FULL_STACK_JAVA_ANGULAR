package com.wipro.notification_service.controller;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.notification_service.dto.NotificationDto;
import com.wipro.notification_service.service.NotificationService;


@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notify")
    public ResponseEntity<String> notifyUserAction(@RequestBody NotificationDto notificationDto) {
        notificationService.processNotification(notificationDto);
        return new ResponseEntity<>("Notification received successfully!", HttpStatus.OK);
    }
}
