package com.hospital_system.service;

import java.util.List;

import com.hospital_system.DTO.TreatmentDTO;

public interface PatientToTreatmentService {
	
	public abstract List<TreatmentDTO> getTreatmentForPatient(Integer patientId);
	
	public abstract String addTreatmentForPatient(Integer patientId,Integer treatmentNumber);
	
	public abstract String deleteTreatmentForPatient(Integer treatmentNumber,Integer patientId);
	
	public abstract String deletePatientFromreltion(Integer patientId);
}
