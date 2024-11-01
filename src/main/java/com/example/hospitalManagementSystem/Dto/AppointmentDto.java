package com.example.hospitalManagementSystem.Dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class AppointmentDto {
	
	private String appointmentId;
	private LocalDateTime appointDate;
	private String status;

}
