package com.example.hospitalManagementSystem.controller;

import com.example.hospitalManagementSystem.service.HmsDoctorServiceImpl;
import com.example.hospitalManagementSystem.service.request.DoctorRequest;
import com.example.hospitalManagementSystem.service.response.DoctorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/doctors")
public class HmsDoctorController {
    @Autowired
    HmsDoctorServiceImpl hmsDoctorServiceImpl;

    @GetMapping("/getDoctorByDoctorId/{doctorId}")
    public ResponseEntity<DoctorResponse> getDoctorByDoctorId(@PathVariable("doctorId") String doctorId) {
     return new ResponseEntity<>(hmsDoctorServiceImpl.getDoctorByDoctorId(doctorId), HttpStatus.OK);
    }
    @PostMapping("/addDoctor")
    public ResponseEntity<String> addDoctor(@RequestBody DoctorRequest doctorRequest){
        return  new ResponseEntity<>(hmsDoctorServiceImpl.addDoctor(doctorRequest),HttpStatus.CREATED);
    }
    @PutMapping("/updateDoctor")
    public ResponseEntity<String> updateDoctor(DoctorRequest doctorRequest){
        return new ResponseEntity<>(hmsDoctorServiceImpl.updateDoctor(doctorRequest),HttpStatus.CREATED);

    }
    @DeleteMapping("/deleteDoctor/{doctorId}")
    public ResponseEntity<String> deleteDoctor(String doctorId){
        return  new ResponseEntity<>(hmsDoctorServiceImpl.deleteDoctor(doctorId),HttpStatus.OK);
    }
}
