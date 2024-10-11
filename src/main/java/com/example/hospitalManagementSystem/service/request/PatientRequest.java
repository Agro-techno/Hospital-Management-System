package com.example.hospitalManagementSystem.service.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PatientRequest {
    private String patientId;
    private String patientName;
    private int patientAge;
    private char patientGender;
}
