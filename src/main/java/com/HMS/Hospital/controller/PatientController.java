package com.HMS.Hospital.controller;

import com.HMS.Hospital.payload.PatientDto;
import com.HMS.Hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/create")
    public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patientDto){
        return new ResponseEntity<>(patientService.createPatient(patientDto), HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
   public ResponseEntity<String> deletePatient(@PathVariable("id") long id){
        patientService.deletePatient(id);
        return new ResponseEntity<>("patient deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/")
    public List<PatientDto> findAll(){
        return patientService.getAll();
    }

}
