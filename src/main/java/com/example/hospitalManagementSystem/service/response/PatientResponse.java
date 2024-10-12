package com.example.hospitalManagementSystem.service.response;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PatientResponse {
    private String patientId;
    private String patientName;
    private int patientAge;
    private char patientGender;
}
