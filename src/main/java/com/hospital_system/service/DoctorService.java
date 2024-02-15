package com.hospital_system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.DTO.DoctorDTO;

@Component
public interface DoctorService {

	
	
	public abstract String saveDoctor(DoctorDTO doctorDTO);
	
	public abstract DoctorDTO getdoctor(Integer doctorId);
	
	public abstract String deleteDoctor(Integer doctorId);
	
	public abstract List<DoctorDTO> getalldoctors();
}
