package com.HMS.Hospital.payload;

import lombok.Data;

@Data
public class PatientDto {

    private long id;
    private String patientName;
    private String mobile;
    private String AppointmentDate;
    private String illness;

}
