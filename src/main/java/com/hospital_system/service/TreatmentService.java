package com.hospital_system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.DTO.TreatmentDTO;

@Component
public interface TreatmentService {

	
	
	public abstract String saveTreatment(TreatmentDTO treatmentDTO);
	
	public abstract TreatmentDTO getTreatment(Integer treatmentNumber);
	
	public abstract String deleteTreatment(Integer treatmentNumber);
	
	public abstract List<TreatmentDTO>  getAll();
}
