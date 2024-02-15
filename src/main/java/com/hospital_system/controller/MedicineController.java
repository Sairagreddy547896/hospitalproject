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

import com.hospital_system.DTO.MedicineDTO;
import com.hospital_system.service.MedicineService;

@RestController
@RequestMapping("medicine")
public class MedicineController {

	
	@Autowired
	private MedicineService medicineService;
	
	@PostMapping("savemedicine")
	public ResponseEntity<String>  saveMedicine(@RequestBody MedicineDTO medicineDTO){
		
	String message=	medicineService.saveMedicine(medicineDTO);
		
		
	return ResponseEntity.ok(message);
		
	}
	
	@GetMapping("getmedicine")
    public ResponseEntity<MedicineDTO>  getMedicine(@RequestParam Integer medicineCode){
    	
    	
    	          MedicineDTO medicineDto=this.medicineService.getMedicine(medicineCode);
    	          
    	   return ResponseEntity.ok(medicineDto);
    }
	
	//dont forget to write rest controller for these method
	public ResponseEntity<String> deleteMedicine(@RequestParam Integer medicineCode){
		                 String     message =this.medicineService.deleteMedicine(medicineCode);
		                 
		      return ResponseEntity.ok(message);
	}
	
	@GetMapping("getallmedicine")
	public ResponseEntity<List<MedicineDTO>>   getAllMedicine(){
		
	List<MedicineDTO>	  listOfMedicineDto=this.medicineService.getAllMedicine();
	
	return ResponseEntity.ok(listOfMedicineDto);
		
	}
	
}
