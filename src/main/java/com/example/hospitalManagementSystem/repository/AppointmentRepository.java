package com.example.hospitalManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospitalManagementSystem.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, String>{

}
