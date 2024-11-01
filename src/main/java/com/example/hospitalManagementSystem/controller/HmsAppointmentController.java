package com.example.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalManagementSystem.Dto.AppointmentDto;
import com.example.hospitalManagementSystem.entity.Appointment;
import com.example.hospitalManagementSystem.service.HmsAppointmentServiceImpl;

@RestController
@RequestMapping("/api/appointments")
public class HmsAppointmentController {
	
	@Autowired
	private HmsAppointmentServiceImpl hmsAppointmentServiceimpl;
	
	
	@GetMapping("/")
	public ResponseEntity<List<AppointmentDto>> findAllAppointment(){
		return ResponseEntity.ok(this.hmsAppointmentServiceimpl.getAllAppointment());
		
	}
	@GetMapping("/getappointment/{appointmentId}")
	public ResponseEntity<AppointmentDto>findAppointmentById( @PathVariable String appointmentId){
		AppointmentDto appointment = this.hmsAppointmentServiceimpl.getAppointmentById(appointmentId);
		return new ResponseEntity<>(appointment, HttpStatus.OK);
		
	}
	@PostMapping("/scheduleAppointment")
	public ResponseEntity<AppointmentDto> scheduleAppointment(@RequestBody AppointmentDto appointmentDto) {
	    AppointmentDto scheduledAppointment = this.hmsAppointmentServiceimpl.scheduleAppointment(appointmentDto);
	    return new ResponseEntity<>(scheduledAppointment, HttpStatus.CREATED);
	}
	@PutMapping("/updateAppointment/{appointmentId}")
	public ResponseEntity<AppointmentDto> updateAppointment(@RequestBody  AppointmentDto appointmentDto,@PathVariable String appointmentId){
		AppointmentDto updateAppointment = this.hmsAppointmentServiceimpl.updateAppointment(appointmentDto, appointmentId);
		return new ResponseEntity<>(updateAppointment,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/deleteAppointment/{appointmentId}")
	public ResponseEntity<String> cancelAppointment(@PathVariable String appointmentId){
		this.hmsAppointmentServiceimpl.cancelAppointment(appointmentId);
		return new ResponseEntity<String>("Appointment canceled successfully", HttpStatus.OK);
		
	}

}
