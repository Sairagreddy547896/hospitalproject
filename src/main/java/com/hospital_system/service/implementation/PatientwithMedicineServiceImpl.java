package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.MedicineDTO;
import com.hospital_system.SQLquery.PatientToMedicineSqlQuery;
import com.hospital_system.entity.Medicine;
import com.hospital_system.repostiory.PatientRepo;
import com.hospital_system.service.PatientToMedicineService;

@Component
public class PatientwithMedicineServiceImpl implements PatientToMedicineService {
	
	@Autowired
	private PatientRepo patientRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PatientToMedicineSqlQuery patientWithMedicineSqlQuery;

	@Override
	public List<MedicineDTO> getMedicinesOfPatient(Integer patientID) {
		// TODO Auto-generated method stub
		
		    List<Medicine> listofmedicine =this.patientRepo.getMedicineOfPatient(patientID);
		    
		     List<MedicineDTO> listofmedicineDto=new ArrayList<>();
		     
		       for(Medicine val:listofmedicine) {
		    	   
		    	 listofmedicineDto.add(this.modelMapper.map(val, MedicineDTO.class));
		       }
		 
		return listofmedicineDto;
	}

	@Override
	public String addMedicineForPatient(Integer patientId, Integer medicineCode) {
		// TODO Auto-generated method stub
		
		           patientWithMedicineSqlQuery.addMedicineForPatient(patientId, medicineCode);
		           
		return "success";
	}

	@Override
	public String deleteMedicineForPatient(Integer medicineCode,Integer patientId) {
		// TODO Auto-generated method stub
		
		               this.patientWithMedicineSqlQuery.deleteMedicineForPatient(medicineCode,patientId);
		                
		return "Success";
	}

	@Override
	public String deletePatientFromrelation(Integer patientId) {
		// TODO Auto-generated method stub
		this.patientWithMedicineSqlQuery.deletePatientFromRelation(patientId);
		           
		return "success";
	}

}
