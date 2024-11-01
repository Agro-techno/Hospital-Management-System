package com.example.hospitalManagementSystem.service;

import java.util.List;

import com.example.hospitalManagementSystem.Dto.AppointmentDto;


public interface HmsAppointmentService {
	
	public List<AppointmentDto> getAllAppointment();
	public AppointmentDto scheduleAppointment(AppointmentDto appointmentRequest);
	public void cancelAppointment(String appointmentId);
	
	public AppointmentDto getAppointmentById(String appointmentId);
	
	public AppointmentDto updateAppointment(AppointmentDto appointmentDto, String appointmentId);
	
	

}
