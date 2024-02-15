package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.TreatmentDTO;
import com.hospital_system.SQLquery.PatientToTreatmentSqlQuery;
import com.hospital_system.entity.Treatment;
import com.hospital_system.repostiory.PatientRepo;
import com.hospital_system.service.PatientToTreatmentService;

@Component
public class PateintToTreatmentServiceImpl implements PatientToTreatmentService {
	
	@Autowired
	private PatientRepo patientRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PatientToTreatmentSqlQuery patientWithTreatmentSqlQuery;
	
	@Override
	public List<TreatmentDTO> getTreatmentForPatient(Integer patientId) {
		// TODO Auto-generated method stub
		
		    List<Treatment> listOfTreatment=this.patientRepo.getTreatmentOfPatient(patientId);
		    
		       List<TreatmentDTO> listOfTreatmentDto=new ArrayList<>();
		       
		       for(Treatment val:listOfTreatment) {
		    	 listOfTreatmentDto.add(this.modelMapper.map(val, TreatmentDTO.class));
		       }
		return listOfTreatmentDto;
	}

	@Override
	public String addTreatmentForPatient(Integer patientId, Integer treatmentNumber) {
		// TODO Auto-generated method stub
		
		            this.patientWithTreatmentSqlQuery.addtreatmentforpatient(patientId, treatmentNumber);
		return "succeess";
	}

	@Override
	public String deleteTreatmentForPatient(Integer treatmentNumber,Integer patientId) {
		// TODO Auto-generated method stub
		
		               this.patientWithTreatmentSqlQuery.deletetreatmentforpatient(treatmentNumber,patientId);
		return "success";
	}

	@Override
	public String deletePatientFromreltion(Integer patientId) {
		// TODO Auto-generated method stub
		                 
		                this.patientWithTreatmentSqlQuery.deletePatientFromRelation(patientId);
		return "success";
	}

}
