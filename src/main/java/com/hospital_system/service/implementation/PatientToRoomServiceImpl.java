package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.RoomsDTO;
import com.hospital_system.SQLquery.PatientToRoomsSqlQuery;
import com.hospital_system.entity.Rooms;
import com.hospital_system.repostiory.PatientRepo;
import com.hospital_system.service.PatientToRoomsService;

@Component
public class PatientToRoomServiceImpl implements PatientToRoomsService {
	
	     @Autowired
         private PatientToRoomsSqlQuery patienttoRoomsSqlQuery;
	     
	     @Autowired
	     private ModelMapper modelMapper;
	     
	     
	     @Autowired
	     private PatientRepo patientRepo;

	@Override
	public List<RoomsDTO> getRoomsForPatient(Integer patientId) {
		// TODO Auto-generated method stub
		List<Rooms>  listOfRooms= this.patientRepo.getRoomsOfPatient(patientId);
		
		List<RoomsDTO> listOfRoomsDto=new ArrayList<>();
		
		for(Rooms val:listOfRooms) {
		listOfRoomsDto.add(this.modelMapper.map(val, RoomsDTO.class));
		}
		
		              
		             
		return listOfRoomsDto;
	}

	@Override
	public String addRoomsForPatient(Integer patientId, Integer roomId) {
		// TODO Auto-generated method stub
		  this.patienttoRoomsSqlQuery.addRoomsForPatient(patientId, roomId);
		  
		return "success";
	}

	@Override
	public String deleteRoomForPatient(Integer patientId, Integer roomdId) {
		// TODO Auto-generated method stub
		
		         this.patienttoRoomsSqlQuery.deleteRoomForPatient(patientId, roomdId);
		return "success";
	}

	@Override
	public String deletePatientFromRelation(Integer patientId) {
		// TODO Auto-generated method stub
		
		     this.patienttoRoomsSqlQuery.deletePatientFromRelation(patientId);
		return "success";
	}
	
	

	
	   
}
