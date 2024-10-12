package com.example.hospitalManagementSystem.service;

import com.example.hospitalManagementSystem.service.request.DoctorRequest;
import com.example.hospitalManagementSystem.service.response.DoctorResponse;

import java.util.List;

public interface HmsDoctorService {
    public String addDoctor(DoctorRequest doctorRequest);
    public  String updateDoctor(DoctorRequest doctorRequest);
    public  String deleteDoctor(String doctorId);
    public DoctorResponse getDoctorByDoctorId(String doctorId);
    public List<DoctorResponse> getAllDoctor();
}
