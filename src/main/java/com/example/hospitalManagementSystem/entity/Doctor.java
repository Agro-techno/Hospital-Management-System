package com.example.hospitalManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity

public class Doctor {
    @Id
    private String doctorId;

    private String doctorName;
    private String doctorSpecialization;

}
