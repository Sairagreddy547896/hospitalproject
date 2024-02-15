package com.hospital_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_system.DTO.PatientDTO;
import com.hospital_system.service.PatientService;

@RequestMapping("patient")
@RestController
public class PatientController {
	
	 @Autowired
	  private PatientService patientService; 
	 
	 
	 @PostMapping("savepatient")
	  public ResponseEntity<String> savePatient(@RequestBody PatientDTO patientDTO){
		  
		    
		         String message= this.patientService.savePatient(patientDTO);
		  
		  
		  return  ResponseEntity.ok(message);
	  }
	 
	 @GetMapping("getpatientByid")
	  public ResponseEntity<PatientDTO> getPatient(@RequestParam Integer patientId){
		  
		     
		          PatientDTO patientDto =this.patientService.getPatientById(patientId);
		    
		  
		  return  ResponseEntity.ok(patientDto);
	  }
	 
	 //dont forget to write restcontroller for these method
	 @DeleteMapping("deletepatient")
	 public ResponseEntity<String> deletePatient(@RequestParam Integer patientId){
		 
		          String   message=this.patientService.deletePatient(patientId);
		          
		     return ResponseEntity.ok(message);
	 }
	 
	 @GetMapping("getallpatients")
	 public ResponseEntity<List<PatientDTO>> getAll(){
		 
		List<PatientDTO>     listOfPatientDto=this.patientService.getAll();
		
		return ResponseEntity.ok(listOfPatientDto);
		 
	 }

}
