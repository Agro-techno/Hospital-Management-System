package com.example.hospitalManagementSystem.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalManagementSystem.Dto.AppointmentDto;
import com.example.hospitalManagementSystem.entity.Appointment;
import com.example.hospitalManagementSystem.repository.AppointmentRepository;

@Service
public class HmsAppointmentServiceImpl implements HmsAppointmentService

{
	@Autowired
	private AppointmentRepository appointmentRepository;

	
	
	
	public Appointment dtoToAppointment(AppointmentDto appointmentDto) {
		
		Appointment appointment= new Appointment();
		appointment.setAppointmentId(appointmentDto.getAppointmentId());
		appointment.setAppointDate(appointmentDto.getAppointDate());
		appointment.setStatus(appointmentDto.getStatus());
		return appointment;
		
	}
	
	public AppointmentDto appointmentToDto(Appointment appointment) {
		AppointmentDto appointmentDto= new AppointmentDto();
		appointmentDto.setAppointmentId(appointment.getAppointmentId());
		appointmentDto.setAppointDate(appointment.getAppointDate());
		appointmentDto.setStatus(appointment.getStatus());
		
		return appointmentDto;
	}

	@Override
	public List<AppointmentDto> getAllAppointment() {
		// TODO Auto-generated method stub
		List<Appointment> appointments = this.appointmentRepository.findAll();
		List<AppointmentDto> appointmentDtos = appointments.stream().map(appointment-> appointmentToDto(appointment)).collect(Collectors.toList());
		return appointmentDtos;
	}

	@Override
	public AppointmentDto scheduleAppointment(AppointmentDto appointmentDto) {
		// TODO Auto-generated method stub
		Appointment appointment = this.dtoToAppointment(appointmentDto);
		Appointment savedAppointment = appointmentRepository.save(appointment);
		return appointmentToDto(savedAppointment);
	}

	

//	
	 @Override
	    public void cancelAppointment(String appointmentId) {
	        Appointment appointment = appointmentRepository.findById(appointmentId)
	                .orElseThrow(() -> new RuntimeException("Appointment not found"));
	        appointmentRepository.delete(appointment);
	    }

	@Override
	public AppointmentDto getAppointmentById(String appointmentId) {
		// TODO Auto-generated method stub
		 Appointment appointment = appointmentRepository.findById(appointmentId)
	                .orElseThrow(() -> new RuntimeException("Appointment not found"));
	        
			return this.appointmentToDto(appointment);
	}

	@Override
	public AppointmentDto updateAppointment(AppointmentDto appointmentDto, String appointmentId) {
		// TODO Auto-generated method stub
		
		
		Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
		
		appointment.setAppointmentId(appointmentDto.getAppointmentId());
		appointment.setAppointDate(appointmentDto.getAppointDate());
		appointment.setStatus(appointmentDto.getStatus());
		
		Appointment updateAppointment = this.appointmentRepository.save(appointment);
		AppointmentDto appointmentDto1 = this.appointmentToDto(updateAppointment);
		
		return appointmentDto1;
	}
	


}
