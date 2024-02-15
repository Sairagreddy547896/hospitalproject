package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Treatment {

	@Id
	private Integer treatmentNumber;
	private String treatmentName;
	private Double treatmentCost;
	
}
