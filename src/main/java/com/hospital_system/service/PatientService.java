package com.hospital_system.service;

import java.util.List;

import com.hospital_system.DTO.PatientDTO;

public interface PatientService {
	
	
	public abstract String savePatient(PatientDTO patientdto);
	
	public abstract PatientDTO getPatientById(Integer patientId);
	
	public abstract String deletePatient(Integer patientId);
	
	public abstract List<PatientDTO>  getAll();
	

}
