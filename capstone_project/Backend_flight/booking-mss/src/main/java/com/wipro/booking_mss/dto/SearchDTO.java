package com.wipro.booking_mss.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDTO {
	private String source;
    private String destination;
    private LocalDate date;

}
