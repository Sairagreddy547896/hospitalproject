package com.hospital_system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.DTO.MedicineDTO;

@Component
public interface PatientToMedicineService {
	
	public abstract List<MedicineDTO> getMedicinesOfPatient(Integer patientID);
	
	public abstract String addMedicineForPatient(Integer patientId,Integer medicineCode);
	
	public abstract String deleteMedicineForPatient(Integer medicineCode,Integer patientId);
	
	public abstract String deletePatientFromrelation(Integer patientId);

}
