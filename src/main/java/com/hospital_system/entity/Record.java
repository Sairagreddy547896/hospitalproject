package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Record {

	@Id
	@GeneratedValue
	private Long recordNumber;
	private Long patientId;
	private String description;
	
	
	
	
}
