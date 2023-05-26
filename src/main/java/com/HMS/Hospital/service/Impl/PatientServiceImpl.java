package com.HMS.Hospital.service.Impl;

import com.HMS.Hospital.Entity.Patient;
import com.HMS.Hospital.payload.PatientDto;
import com.HMS.Hospital.repository.PatientRepository;
import com.HMS.Hospital.service.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public PatientDto createPatient(PatientDto patientDto) {

        Patient patient = mapToEntity(patientDto);
        Patient save = patientRepository.save(patient);
        PatientDto dto = mapToDto(save);
          return dto;

    }
    @Override
    public void deletePatient(long id) {
      //  patientRepository.findById(id).orElseThrow(()-> new RuntimeException("patient","id",id));
        patientRepository.deleteById(id);
    }

    @Override
    public List<PatientDto> getAll() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(e-> mapToDto(e)).collect(Collectors.toList());

    }

    public Patient mapToEntity(PatientDto patientDto){
       Patient patient = mapper.map(patientDto, Patient.class);

//        Patient patient = new Patient();
//        patient.setPatientName(patientDto.getPatientName());
//        patient.setAppointmentDate(patientDto.getAppointmentDate());
//        patient.setMobile(patientDto.getMobile());
//        patient.setIllness(patientDto.getIllness());
        return patient;
    }

    public PatientDto mapToDto(Patient patient){
       PatientDto patientDto = mapper.map(patient, PatientDto.class);

//       PatientDto patientDto = new PatientDto();
//       patientDto.setPatientName(patient.getPatientName());
//       patientDto.setAppointmentDate(patient.getAppointmentDate());
//       patientDto.setMobile(patient.getMobile());
//       patientDto.setIllness(patient.getIllness());
       return patientDto;
    }

}
