package com.example.hospitalManagementSystem.service;

import com.example.hospitalManagementSystem.service.request.DoctorRequest;
import com.example.hospitalManagementSystem.service.response.DoctorResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HmsDoctorServiceImpl implements HmsDoctorService {
    @Override
    public String addDoctor(DoctorRequest doctorRequest) {
        return "";
    }

    @Override
    public String updateDoctor(DoctorRequest doctorRequest) {
        return "";
    }

    @Override
    public String deleteDoctor(String doctorId) {
        return "";
    }

    @Override
    public DoctorResponse getDoctorByDoctorId(String doctorId) {
        return null;
    }

    @Override
    public List<DoctorResponse> getAllDoctor() {
        return List.of();
    }
}
