package com.hospital_system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.DTO.MedicineDTO;



@Component
public interface MedicineService {

	
	
	public abstract String saveMedicine(MedicineDTO medicineDTO);
	
	public abstract MedicineDTO getMedicine(Integer medicinecode);
	
	public abstract String deleteMedicine(Integer medicinecode);
	
	public abstract List<MedicineDTO>  getAllMedicine();
}
