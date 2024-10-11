package com.example.hospitalManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {
    @Id
    private String patientId;
    private String patientName;
    private int patientAge;
    private char patientGender;

}
