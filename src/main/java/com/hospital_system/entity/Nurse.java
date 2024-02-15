package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="employeeid")
public class Nurse extends Employee {

	 private String nurseSpecilaity;
	 private String nurseQualification;
	 private String nurseHistory;
	
}
