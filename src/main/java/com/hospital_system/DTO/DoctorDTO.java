package com.hospital_system.DTO;

import com.hospital_system.entity.Employee;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class DoctorDTO extends Employee{
		
		 
		 private String doctorSpecilaity;
		 private String doctorQualification;
		 private String doctorHistory;
		 private Double doctorSalary;
		
		
		

	}

