package com.hospital_system.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.entity.Doctor;
import com.hospital_system.entity.Medicine;
import com.hospital_system.entity.PatientDetails;
import com.hospital_system.entity.Rooms;
import com.hospital_system.entity.Treatment;

import lombok.Data;

@Data
@Component
public class PatientDTO {

	private Integer patientId;
	private String patientFirstName;
	private String patientLastName;
	private String patientGender;
	private String patientAddress;
	private PatientDetails patientdetails;
	private Long patientPrimaryContactNumber;
	private Long patientSecoundaryContactNumber;
	private List<Rooms> roomsAllotedForPatient; 
	private List<Medicine> medicienGivenToPatient;
	private List<Doctor> doctors;
	private List<Treatment> treatment;
}
