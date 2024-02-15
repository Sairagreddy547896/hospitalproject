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

import com.hospital_system.DTO.DoctorDTO;
import com.hospital_system.service.DoctorService;


@RestController
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	
	@PostMapping("savedoctor")
	public ResponseEntity<String> savedoctor(@RequestBody DoctorDTO doctorDTO){
		
		  String message= this.doctorService.saveDoctor(doctorDTO);
		return ResponseEntity.ok(message);
	}
	
	
	@GetMapping("getdoctor")
	public ResponseEntity<DoctorDTO> getdoctor(@RequestParam Integer doctorId){
		
		 DoctorDTO doctorDto= this.doctorService.getdoctor(doctorId);
		return ResponseEntity.ok(doctorDto);
	}
	
	//dont forget write about 
	@DeleteMapping("deletedoctor")
	public ResponseEntity<String>  deleteDoctor(@RequestParam Integer doctorId){
		
		      String   message=this.doctorService.deleteDoctor(doctorId);
		      
		      
		      return ResponseEntity.ok(message);
		
	}
	
	@GetMapping("alldoctors")
	public ResponseEntity<List<DoctorDTO>> getAllDoctors(){
		
		     List<DoctorDTO>   listOfDoctorsDto =this.doctorService.getalldoctors();
		     
		     return ResponseEntity.ok(listOfDoctorsDto);
		
	}
 	
}
