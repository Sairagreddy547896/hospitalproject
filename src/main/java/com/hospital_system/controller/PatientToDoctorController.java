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

import com.hospital_system.DTO.DoctorDTO;
import com.hospital_system.service.PatientToDoctorService;



@RestController
@RequestMapping("patientanddoctor")
public class PatientToDoctorController {
	
 
  
  @Autowired
  private PatientToDoctorService patientToDoctorService;
  
 
  @PutMapping("adddoctor")
  public ResponseEntity<String> adddoctorsforPatient(@RequestParam Integer patientId,Integer doctorId){
	  
	     
	          String message=this.patientToDoctorService.addDoctorForPatient(patientId,doctorId);
	    
	  
	  return  ResponseEntity.ok(message);
  }
    
  
 
  
  @GetMapping("getdoctors")
  public ResponseEntity<List<DoctorDTO>> getDoctorsForPatient(@RequestParam Integer patientId){
	  
	     
	          List<DoctorDTO> doctorDto =this.patientToDoctorService.getDoctorsForPatient(patientId);
	    
	  
	  return  ResponseEntity.ok(doctorDto);
  }
  
  @DeleteMapping("deletedoctor")
  public ResponseEntity<String> deleteDoctorForPatient(@RequestParam Integer doctorId,Integer patientId){
	  
	     
	           String  message= this.patientToDoctorService.deleteDoctorForPatient(doctorId,patientId);
	  
	  return ResponseEntity.ok(message);
  }
  
  public ResponseEntity<String> deletePatientFromRelation(@RequestParam Integer patientId){
	  
	               String  message=this.patientToDoctorService.deletePatientFromRelation(patientId);
	               
	    return ResponseEntity.ok(message);
  }
  
  
  
  
  
 }
  