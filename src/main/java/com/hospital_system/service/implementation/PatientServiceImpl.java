package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.PatientDTO;
import com.hospital_system.entity.Patient;
import com.hospital_system.repostiory.PatientRepo;
import com.hospital_system.service.PatientService;




@Component
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepo patientRepo;
	
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public String savePatient(PatientDTO patientdto) {
		
		Patient patient=this.modelMapper.map(patientdto, Patient.class);
		   patientRepo.save(patient);
		   
		   return "success";
	}

	@Override
	public PatientDTO getPatientById(Integer patientId) {
		
		     Patient patinet=this.patientRepo.getPatientById(patientId);
		     
		     PatientDTO  patientDTO =this.modelMapper.map(patinet, PatientDTO.class);
		
		return patientDTO;
	}

	@Override
	public String deletePatient(Integer patientId) {
		// TODO Auto-generated method stub
		
		                       this.patientRepo.deleteById(patientId);
		                       
		return "success";
	}

	@Override
	public List<PatientDTO> getAll() {
		// TODO Auto-generated method stub
		
		       List<Patient>   listOfPatient=this.patientRepo.getAll();
		       
		       List<PatientDTO>  listOfPatientDto=new ArrayList<>();
		       for(Patient val:listOfPatient) {
		    	  listOfPatientDto.add(this.modelMapper.map(val, PatientDTO.class));
		       }
		       
		                
		return listOfPatientDto;
	}

	
	


	

	
}
