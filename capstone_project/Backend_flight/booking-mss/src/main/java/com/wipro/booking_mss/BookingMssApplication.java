package com.wipro.booking_mss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookingMssApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingMssApplication.class, args);
	}

}
