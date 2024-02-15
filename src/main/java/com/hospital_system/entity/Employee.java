package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

	@Id
	@GeneratedValue
	private Integer employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private Double employeeSalary;
	private Long employeePrimaryContactNumber;
	private Long employeeSecoundaryContactNumber;
	private String employeeGender;
	private Integer employeeAge;
	
	
}
