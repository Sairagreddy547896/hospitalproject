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

import com.hospital_system.DTO.RoomsDTO;
import com.hospital_system.service.PatientToRoomsService;

@RestController
@RequestMapping("patienttoroom")
public class PatientToRoomController {
	
	@Autowired
	private PatientToRoomsService patientToRoomsService;
	
	
	@PutMapping("addroom")
	  public ResponseEntity<String> addroomforPatient(@RequestParam Integer patientId,Integer roomId){
		  
		     
		          String message=this.patientToRoomsService.addRoomsForPatient(patientId,roomId);
		    
		  
		  return  ResponseEntity.ok(message);
	  }
	    
	  
	 
	  
	  @GetMapping("getrooms")
	  public ResponseEntity<List<RoomsDTO>> getRoomsForPatient(@RequestParam Integer patientId){
		  
		     
		          List<RoomsDTO> listOfroomsDto =this.patientToRoomsService.getRoomsForPatient(patientId);
		    
		  
		  return  ResponseEntity.ok(listOfroomsDto);
	  }
	  
	  //dont forget to add controller 
	  @DeleteMapping("deleteroom")
	  public ResponseEntity<String> deleteRoomForPatient(@RequestParam Integer doctorId,@RequestParam Integer patientId){
		  
		                         String   message=this.patientToRoomsService.deleteRoomForPatient(doctorId, patientId);
		         return ResponseEntity.ok(message);
	  }
	
	  @DeleteMapping("deletepatient")
	  public ResponseEntity<String> deletePatientFromRelation(@RequestParam Integer patientId){
		                  String  message=this.patientToRoomsService.deletePatientFromRelation(patientId);
		                  
		                  
		     return ResponseEntity.ok(message);
	  }
	  
	  
	   
	
	

}
