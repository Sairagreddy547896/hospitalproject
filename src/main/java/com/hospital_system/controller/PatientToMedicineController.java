package com.hospital_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_system.DTO.MedicineDTO;
import com.hospital_system.service.PatientToMedicineService;

@RestController
@RequestMapping("patienttomedicine")
public class PatientToMedicineController {
	
	@Autowired
	private PatientToMedicineService patientToMedicineService;
	
	
	@GetMapping("getmedicine")
	public ResponseEntity<List<MedicineDTO>>  getMedicineOfPatient(@RequestParam Integer patientId){
		
		              List<MedicineDTO>  listOfMedicinedto=this.patientToMedicineService.getMedicinesOfPatient(patientId);
		              
		              
		  return ResponseEntity.ok(listOfMedicinedto);
		
	}
	
	@PutMapping("addmedicine")
	public ResponseEntity<String>  addMedicineOfPatient(@RequestParam Integer patientId,@RequestParam Integer medicineCode){
		
		            String  message=this.patientToMedicineService.addMedicineForPatient(patientId,medicineCode);
		              
		              
		  return ResponseEntity.ok(message);
		
	}
	
	//dont forget to add restcontroller for these method
	@DeleteMapping("deletemedicine")
	public ResponseEntity<String>  deleteMedicineOfPatient(@RequestParam Integer medicineCode,@RequestParam Integer patientId){
		
		            String  message=this.patientToMedicineService.deleteMedicineForPatient(medicineCode,patientId);
		              
		              
		  return ResponseEntity.ok(message);
		
	}
	
	@DeleteMapping("deletepatient")
	public ResponseEntity<String>  deletepatientFromRelation(@RequestParam Integer patientId){
		                    String    message=this.patientToMedicineService.deletePatientFromrelation(patientId);
		                    
		    return ResponseEntity.ok(message);
	}
	

}
