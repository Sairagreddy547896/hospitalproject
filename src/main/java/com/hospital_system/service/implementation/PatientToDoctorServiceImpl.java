package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.DoctorDTO;
import com.hospital_system.SQLquery.PatienttoDoctorSqlQuery;
import com.hospital_system.entity.Doctor;
import com.hospital_system.repostiory.PatientRepo;
import com.hospital_system.service.PatientToDoctorService;

@Component
public class PatientToDoctorServiceImpl implements PatientToDoctorService {
	
	
		@Autowired
		private ModelMapper modelMapper;
		
		
		@Autowired
		private PatientRepo patientRepo;
		   
	
		@Autowired
		private PatienttoDoctorSqlQuery patientWithDoctorSqlQuery;
	
		@Override
		public List<DoctorDTO> getDoctorsForPatient(Integer patientId) {
			// TODO Auto-generated method stub
			
			 List<Doctor> listofdocors=this.patientRepo.getDoctorsForPatient(patientId);
		     
		     List<DoctorDTO> listofdoctorDTO=new ArrayList<>();
		            for(Doctor val:listofdocors) {
		              listofdoctorDTO.add(this.modelMapper.map(val,DoctorDTO.class));
		            }
		     
		    
		 
		return listofdoctorDTO;
		}

		@Override
		public String addDoctorForPatient(Integer patientId, Integer doctorId) {
			
			   
			             patientWithDoctorSqlQuery.adddoctorforpatient(patientId, doctorId);
			
			return "success";
		}

		@Override
		public String deleteDoctorForPatient(Integer doctorId,Integer patientId) {
			
			      patientWithDoctorSqlQuery.deleteadoctorforpatient(doctorId,patientId);
			      
			return "Success";
		}

		@Override
		public String deletePatientFromRelation(Integer patientId) {
			// TODO Auto-generated method stub
			              this.patientWithDoctorSqlQuery.deletePatientFromRelation(patientId);
			return "message";
		}
	
		
	

		
		
		
	}
