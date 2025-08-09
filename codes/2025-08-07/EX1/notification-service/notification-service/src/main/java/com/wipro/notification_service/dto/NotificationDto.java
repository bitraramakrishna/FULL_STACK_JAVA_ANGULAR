package com.wipro.notification_service.dto;

import com.wipro.notification_service.entity.User;

public class NotificationDto {
	 private User user;
	    private String action;

	    public void NotificationDTO() {
	    }

	    public void NotificationDTO(User user, String action) {
	        this.user = user;
	        this.action = action;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public String getAction() {
	        return action;
	    }

	    public void setAction(String action) {
	        this.action = action;
	    }

	    @Override
	    public String toString() {
	        return "NotificationDTO{" +
	               "user=" + user +
	               ", action='" + action + '\'' +
	               '}';
	    }
}
