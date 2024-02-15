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

import com.hospital_system.DTO.NurseDTO;
import com.hospital_system.service.NurseService;

@RestController
@RequestMapping("nurse")
public class NurseController {

	
	@Autowired
	private NurseService nurseService;
	
	@PostMapping("savenurse")
	public ResponseEntity<String> saveNurse(@RequestBody NurseDTO nurseDTO){
		
		
	String message=	nurseService.saveNurse(nurseDTO);
	
	return ResponseEntity.ok(message);
		
	}
	
	@GetMapping("getnurse")
	public ResponseEntity<NurseDTO>  getNurse(@RequestParam Integer nurseId){
		
		            NurseDTO nurseDto=this.nurseService.getNurse(nurseId);
		            
		    return ResponseEntity.ok(nurseDto);
	}
	//dont forget to write rest controller for these method
	@DeleteMapping("deletenurse")
	public ResponseEntity<String>  deleteNurse(@RequestParam Integer nurseId){
		
		            String message=this.nurseService.deleteNurse(nurseId);
		            
		return ResponseEntity.ok(message);
	}
	
	@GetMapping("getallNurse")
	public ResponseEntity<List<NurseDTO>> getAllNurse(){
		
		       List<NurseDTO>    listOfNurseDto=this.nurseService.getAllNurse();
		       
		 return ResponseEntity.ok(listOfNurseDto);
	}
	
}
