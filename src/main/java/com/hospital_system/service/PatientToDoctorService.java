package com.hospital_system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.DTO.DoctorDTO;


@Component
public interface PatientToDoctorService {
	
	 
	public abstract List<DoctorDTO> getDoctorsForPatient(Integer patientId);
	
	public abstract String addDoctorForPatient(Integer patientId,Integer doctorId); 
	
	public abstract String deleteDoctorForPatient(Integer doctorId,Integer patientId);
	
	public abstract String deletePatientFromRelation(Integer patientId);
	
	
}
