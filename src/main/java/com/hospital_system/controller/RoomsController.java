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

import com.hospital_system.DTO.RoomsDTO;
import com.hospital_system.service.RoomsService;

@RestController
@RequestMapping("rooms")
public class RoomsController {

	@Autowired
	private RoomsService roomsService;
	
	@PostMapping("saveroom")
	public ResponseEntity<String> saveRooms(@RequestBody RoomsDTO roomsDTO){
		
	String messsage=	roomsService.saveRooms(roomsDTO);
		
		return ResponseEntity.ok(messsage); 
	}
	
	@GetMapping("getroom")
	public ResponseEntity<RoomsDTO> getRooms(@RequestParam Integer roomsId){
		
		 RoomsDTO roomsDto= this.roomsService.getRoomById(roomsId);
		return ResponseEntity.ok(roomsDto);
	}
	
	//dont forget write about 
	@DeleteMapping("deleteroom")
	public ResponseEntity<String>  deleteRoom(@RequestParam Integer roomId){
		
		    String  message=this.roomsService.deleteRoom(roomId);
		      
		      return ResponseEntity.ok(message);
		
	}
	
	@GetMapping("allrooms")
	public ResponseEntity<List<RoomsDTO>> getAllRooms(){
		
		     List<RoomsDTO>   listOfRoomsDto =this.roomsService.getAll();		     
		     return ResponseEntity.ok(listOfRoomsDto);
		
	}
	
}
