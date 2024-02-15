package com.hospital_system.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//composite attribute class
@Data

public class PatientDetailsDTO {
	
	@Id
	@GeneratedValue
	private Integer patientId;
	private String dateAdmitted;
	private String dateDischarged;

}