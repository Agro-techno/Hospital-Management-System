package com.example.hospitalManagementSystem.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
public class Appointment {
    private String appointmentID;
    private Date appointmentDate;
}
