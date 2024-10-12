package com.example.hospitalManagementSystem.service;

import com.example.hospitalManagementSystem.entity.Patient;
import com.example.hospitalManagementSystem.repository.PatientRepository;
import com.example.hospitalManagementSystem.service.request.PatientRequest;
import com.example.hospitalManagementSystem.service.response.PatientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class HmsPatientServiceImpl implements HmsPatientService {
    @Autowired
    PatientRepository patientRepository;


    @Override
    public String addPatient(PatientRequest patientRequest) {
        Patient patient=new Patient();
        patient.setPatientId(patientRequest.getPatientId());
        patient.setPatientAge(patientRequest.getPatientAge());
        patient.setPatientGender(patientRequest.getPatientGender());
        patient.setPatientName(patientRequest.getPatientName());
        patientRepository.save(patient);

        return "Patient added successfully with patientId "+patient.getPatientId();
    }

    @Override
    public String updatePatient(PatientRequest patientRequest) {
        if(patientRepository.existsById(patientRequest.getPatientId())){
            Patient patient=new Patient();
            patient.setPatientId(patientRequest.getPatientId());
            patient.setPatientAge(patientRequest.getPatientAge());
            patient.setPatientGender(patientRequest.getPatientGender());
            patient.setPatientName(patientRequest.getPatientName());
            patientRepository.save(patient);
            return "Patient updated successfully with patientId "+patient.getPatientId();
        }
        return "Patient not found";

    }

    @Override
    public String deletePatient(String patientId) {
        if(patientRepository.existsById(patientId)){
            patientRepository.deleteById(patientId);
            return "patient deleted successfully with id "+patientId;
        }

        return "Patient not found";
    }

    @Override
    public List<PatientResponse> getAllPatient() {
        return List.of();
    }

    @Override
    public PatientResponse getPatientById(String patientId) {
        if(patientRepository.existsById(patientId)){
            PatientResponse patientResponse=new PatientResponse();
            Optional<Patient> optionalPatient=patientRepository.findById(patientId);
            Patient patient=optionalPatient.get();
            patientResponse.setPatientAge(patient.getPatientAge());
            patientResponse.setPatientGender(patient.getPatientGender());
            patientResponse.setPatientName(patient.getPatientName());
            patientResponse.setPatientId(patient.getPatientId());
            return patientResponse;
        }
        return null;
    }
}
