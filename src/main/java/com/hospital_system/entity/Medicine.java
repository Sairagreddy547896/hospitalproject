package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Medicine {

	@Id
 	private Integer medicineCode;
	private String medicineName;
	private String medicineType;
	private String medicineQuantity;
	private Double medicinePrice;
	
	
}
