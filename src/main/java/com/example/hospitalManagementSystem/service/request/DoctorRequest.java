package com.example.hospitalManagementSystem.service.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DoctorRequest {
    private String doctorId;

    private String doctorName;
    private String doctorSpecialization;
}
