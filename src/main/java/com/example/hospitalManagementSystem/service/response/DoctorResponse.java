package com.example.hospitalManagementSystem.service.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DoctorResponse {
    private String doctorId;

    private String doctorName;
    private String doctorSpecialization;
}
