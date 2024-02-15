package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="employeeid")
public class Doctor extends Employee{
	
	
	 private String doctorSpecilaity;
	 private String doctorQualification;
	 private String doctorHistory;
	
	
	

}
