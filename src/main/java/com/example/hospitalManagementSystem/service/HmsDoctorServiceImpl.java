package com.example.hospitalManagementSystem.service;

import com.example.hospitalManagementSystem.entity.Doctor;
import com.example.hospitalManagementSystem.repository.DoctorRepository;
import com.example.hospitalManagementSystem.service.request.DoctorRequest;
import com.example.hospitalManagementSystem.service.response.DoctorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HmsDoctorServiceImpl implements HmsDoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    @Override
    public String addDoctor(DoctorRequest doctorRequest) {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorRequest.getDoctorId());
        doctor.setDoctorName(doctorRequest.getDoctorName());
        doctor.setDoctorSpecialization(doctorRequest.getDoctorSpecialization());
        doctorRepository.save(doctor);

        return "Doctor added successfully with patientId " +doctor.getDoctorId();
    }

    @Override
    public String updateDoctor(DoctorRequest doctorRequest) {
      if(doctorRepository.existsById(doctorRequest.getDoctorId())) {
          Doctor doctor = new Doctor();
          doctor.setDoctorId(doctorRequest.getDoctorId());
          doctor.setDoctorName(doctorRequest.getDoctorName());
          doctor.setDoctorSpecialization(doctorRequest.getDoctorSpecialization());
          doctorRepository.save(doctor);
          return "Doctor updated successfully with patientId " +doctor.getDoctorId();
      }
        return "Doctor not found";
    }

    @Override
    public String deleteDoctor(String doctorId) {
        if(doctorRepository.existsById(doctorId)){
            doctorRepository.deleteById(doctorId);
            return "Doctor deleted successfully with patientId " +doctorId;
        }
        return "Doctor not found";
    }

    @Override
    public DoctorResponse getDoctorByDoctorId(String doctorId) {
        if(doctorRepository.existsById(doctorId)){
            DoctorResponse doctorResponse = new DoctorResponse();
            Optional<Doctor> optionalDoctor =doctorRepository.findById(doctorId);
            Doctor doctor = optionalDoctor.get();
            doctorResponse.setDoctorId(doctor.getDoctorId());
            doctorResponse.setDoctorName(doctor.getDoctorName());
            doctorResponse.setDoctorSpecialization(doctor.getDoctorSpecialization());
            return doctorResponse;
        }
        return null;
    }

    @Override
    public List<DoctorResponse> getAllDoctor() {
        return List.of();
    }

    @Override
    public DoctorResponse getDoctorById(String doctorId) {
        return null;
    }
}
