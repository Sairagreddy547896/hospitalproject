package com.hospital_system.DTO;

import lombok.Data;


@Data
public class MedicineDTO {

	
 	private Integer medicineCode;
	private String medicineQuantity;
	private Double medicinePrice;
	private String medicineName;
	private String medicineType;
	
}
