package com.hospital_system.DTO;

import lombok.Data;

@Data
public class EmployeeDTO  {

	
	private Integer employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private Double employeeSalary;
	private Long employeePrimaryContactNumber;
	private Long employeeSecoundaryContactNumber;
	private String employeeGender;
	private String employeeAddress;
	private Integer employeeAge;
	
	
}
