package com.hospital_system.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NurseDTO extends EmployeeDTO {

	 private String nurseSpecilaity;
	 private String nurseQualification;
	 private String nurseHistory;
	 private Double nurseSalary;
	
}