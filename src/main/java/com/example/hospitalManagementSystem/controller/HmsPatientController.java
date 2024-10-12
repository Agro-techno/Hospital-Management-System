package com.example.hospitalManagementSystem.controller;

import com.example.hospitalManagementSystem.service.HmsPatientServiceImpl;
import com.example.hospitalManagementSystem.service.request.PatientRequest;
import com.example.hospitalManagementSystem.service.response.PatientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@ResponseBody()
@RequestMapping("/hmshome")
public class HmsPatientController {
    @Autowired
    HmsPatientServiceImpl hmsPatientServiceImpl;
    @GetMapping("/test")
    public String getController(){
        System.out.println("Controller called ");
        return "Jai shree ram Controller has called";
    }

    @GetMapping("/getPatientById/{patientId}")
  public ResponseEntity<PatientResponse> getPatientById(@PathVariable("patientId") String patientId){
      return new ResponseEntity<>(hmsPatientServiceImpl.getPatientById(patientId),HttpStatus.OK);
  }

    @GetMapping("/getAllPatient")
    public ResponseEntity<List<PatientResponse>> getAllPatient(){
        return new ResponseEntity<>(hmsPatientServiceImpl.getAllPatient(),HttpStatus.OK);
    }
  @PostMapping("/addPatient")
  public ResponseEntity<String> addPatient(@RequestBody PatientRequest patientRequest){
        return  new ResponseEntity<>(hmsPatientServiceImpl.addPatient(patientRequest),HttpStatus.CREATED);
  }
  @DeleteMapping("/deletePatient/{PatientId}")
  public ResponseEntity<String> deletePatient(@PathVariable("patientId") String patientId){
        return new ResponseEntity<>(hmsPatientServiceImpl
                .deletePatient(patientId),HttpStatus.OK);
  }

    @PutMapping("/updatePatient")
    public ResponseEntity<String> updatePatient(@RequestBody PatientRequest patientRequest){
        return  new ResponseEntity<>(hmsPatientServiceImpl.updatePatient(patientRequest),HttpStatus.CREATED);
    }
}