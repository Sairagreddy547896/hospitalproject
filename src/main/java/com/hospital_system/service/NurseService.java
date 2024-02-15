package com.hospital_system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.DTO.NurseDTO;

@Component
public interface NurseService {

	
	public abstract String saveNurse(NurseDTO nurseDTO);
	
	public abstract NurseDTO getNurse(Integer nurseId);
	
	public abstract String deleteNurse(Integer nurseId);
	
	public abstract List<NurseDTO> getAllNurse();
	
}
