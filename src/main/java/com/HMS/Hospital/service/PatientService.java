package com.HMS.Hospital.service;

import com.HMS.Hospital.payload.PatientDto;

import java.util.List;

public interface PatientService {
    PatientDto createPatient(PatientDto patientDto);


    void deletePatient(long id);

    List<PatientDto> getAll();
}
