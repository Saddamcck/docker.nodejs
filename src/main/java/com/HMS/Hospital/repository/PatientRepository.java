package com.HMS.Hospital.repository;

import com.HMS.Hospital.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
