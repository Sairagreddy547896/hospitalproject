package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

//composite attribute class
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PatientDetails {
	
	@Id
	@GeneratedValue
	private Integer patientId;
	private String dateAdmitted;
	private String dateDischarged;

}
