package com.example.hospitalManagementSystem.service;

import com.example.hospitalManagementSystem.service.request.DoctorRequest;
import com.example.hospitalManagementSystem.service.request.PatientRequest;
import com.example.hospitalManagementSystem.service.response.DoctorResponse;
import com.example.hospitalManagementSystem.service.response.PatientResponse;

import java.util.List;

public interface HmsPatientService {
    //Patient methods===========================

    public String addPatient(PatientRequest patientRequest);
    public String updatePatient(PatientRequest patientRequest);
    public String deletePatient(String patientId);
    public List<PatientResponse> getAllPatient();

   public PatientResponse getPatientById(String patientId);

   //Doctor Methods=====================================================



}