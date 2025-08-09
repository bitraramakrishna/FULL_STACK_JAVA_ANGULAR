package com.wipro.notification_service.service;

import com.wipro.notification_service.dto.NotificationDto;

public interface NotificationService {
	void processNotification(NotificationDto notificationDto);
}
