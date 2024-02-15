package com.hospital_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_system.DTO.TreatmentDTO;
import com.hospital_system.service.TreatmentService;

@RequestMapping("treatment")
@RestController
public class TreatmentController {

	
	@Autowired
	private TreatmentService treatmentService;
	
	@PostMapping("savetreatment")
	public ResponseEntity<String> saveTreatment(@RequestBody TreatmentDTO treatmentDTO){
		
		
	String message=	treatmentService.saveTreatment(treatmentDTO);
		
		return ResponseEntity.ok(message);
	}
	
	@GetMapping("gettreatment")
	public ResponseEntity<TreatmentDTO> getTreatment(@RequestParam Integer treatmentNumber){
		
		             TreatmentDTO treatmentDto=this.treatmentService.getTreatment(treatmentNumber);
		             
		      return ResponseEntity.ok(treatmentDto);
	}
	
	//dont forget to write restcontroller for these method
	public ResponseEntity<String> deleteTreatment(@RequestParam Integer treatmentNumber){
		
		        String    message=this.treatmentService.deleteTreatment(treatmentNumber);
		             
		      return ResponseEntity.ok(message);
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<TreatmentDTO>>  getAll(){
		
		    List<TreatmentDTO>    listOfTreatmentDto=this.treatmentService.getAll();
		    
		    return ResponseEntity.ok(listOfTreatmentDto);
		    
	}
	
	
}
