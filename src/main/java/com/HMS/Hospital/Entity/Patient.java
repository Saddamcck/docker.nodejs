package com.HMS.Hospital.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="Patient_name")
    private String patientName;

    @Column(name="Patient_Mobile")
    private String mobile;

    @Column(name="Appointment_Date")
    private String AppointmentDate;

    @Column(name="illness")
    private String illness;

}
