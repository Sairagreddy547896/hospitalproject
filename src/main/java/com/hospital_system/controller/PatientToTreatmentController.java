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

import com.hospital_system.DTO.TreatmentDTO;
import com.hospital_system.service.PatientToTreatmentService;

@RequestMapping("patienttotreatment")
@RestController
public class PatientToTreatmentController {
	
	@Autowired
	private PatientToTreatmentService patientToTreatmentService;

	
	     @GetMapping("gettreatment")
	     public ResponseEntity<List<TreatmentDTO>> getTreatmentForPatient(@RequestParam Integer patientId){
	    	 
	    	 
	    	    List<TreatmentDTO> listOfTreatmentDto=this.patientToTreatmentService.getTreatmentForPatient(patientId);
	    	    
	     return  ResponseEntity.ok(listOfTreatmentDto);
	     }
	    
	     @PutMapping("addtreatment")
	     public ResponseEntity<String> addTreatmentForPatient(@RequestParam Integer patientId ,@RequestParam Integer treatmentNumber){
	    	 
	    	 
	    	  String  message=this.patientToTreatmentService.addTreatmentForPatient(patientId,treatmentNumber);
	    	    
	     return  ResponseEntity.ok(message);
	     }
	     
	     @DeleteMapping("deletetreatment")
	     public ResponseEntity<String> deleteTreatmentForPatient(@RequestParam Integer treatmentNumber,@RequestParam Integer patientId){
	    	 
	    	           String message=this.patientToTreatmentService.deleteTreatmentForPatient(treatmentNumber,patientId);
	    	           
	    	return ResponseEntity.ok(message);
	     }
	     
	     @DeleteMapping("deletepatient")
	     public ResponseEntity<String> deletePatientFromrelation(@RequestParam Integer patientId){
	    	 
	    	          String  message=this.patientToTreatmentService.deletePatientFromreltion(patientId);
	    	          
	    	 return ResponseEntity.ok(message);
	     }
	     
	     
}
