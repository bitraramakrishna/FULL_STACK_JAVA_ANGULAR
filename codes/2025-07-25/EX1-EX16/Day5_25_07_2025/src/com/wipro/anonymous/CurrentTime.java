package com.wipro.anonymous;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class CurrentTime {
	
	public static void main(String[] args) {
        Consumer<String> printCurrentLondonTime = label -> {
            System.out.println(label + ": " + 
                ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/London"))
                             .format(DateTimeFormatter.ofPattern("HH:mm:ss"))); 
        };
        printCurrentLondonTime.accept("Current time in Europe/London");
    }

}
