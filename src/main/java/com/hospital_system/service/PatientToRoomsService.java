package com.hospital_system.service;

import java.util.List;

import com.hospital_system.DTO.RoomsDTO;

public interface PatientToRoomsService {
	
	public abstract List<RoomsDTO> getRoomsForPatient(Integer patientId);
	
	public abstract String addRoomsForPatient(Integer patientId,Integer roomId);
	
	public abstract String deleteRoomForPatient(Integer patientId,Integer roomdId);
	
	public abstract String deletePatientFromRelation(Integer patientId);
	
 

}
