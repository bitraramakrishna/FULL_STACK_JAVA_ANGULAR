package com.wipro.anonymous;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
        Supplier<String> tomorrowDayNameSupplier = () -> {
            LocalDate today = LocalDate.now();
            LocalDate tomorrow = today.plusDays(1);
            DayOfWeek dayOfWeek = tomorrow.getDayOfWeek();
            
            return dayOfWeek.toString(); 
        };
        System.out.println("Tomorrow's Day " + tomorrowDayNameSupplier.get());
    }
}
