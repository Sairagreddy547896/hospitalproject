package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.RoomsDTO;
import com.hospital_system.entity.Rooms;
import com.hospital_system.repostiory.RoomsRepo;
import com.hospital_system.service.RoomsService;


@Component
public class RoomsServiceImpl implements RoomsService {

	
	@Autowired
	private RoomsRepo roomsRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String saveRooms(RoomsDTO roomsDto) {
		
		     Rooms rooms=modelMapper.map(roomsDto, Rooms.class);
		
		     roomsRepo.save(rooms);
		     
		return "success";
	}
	
		@Override
		public String deleteRoom(Integer roomId) {
			
			               roomsRepo.deleteById(roomId);
			               
			return "success";
		}

		@Override
		public RoomsDTO getRoomById(Integer roomId) {
			// TODO Auto-generated method stub
			
			      Rooms room=this.roomsRepo.getRoomById(roomId);
			      RoomsDTO roomDto=this.modelMapper.map(room, RoomsDTO.class); 
			      
			return roomDto;
		}

		@Override
		public List<RoomsDTO> getAll() {
			// TODO Auto-generated method stub
			
			     List<Rooms>     listOfRooms=this.roomsRepo.getAll();
			           
			     List<RoomsDTO>  listOfRoomsDto=new ArrayList<>();
			     
			       for(Rooms val:listOfRooms) {
			    	  listOfRoomsDto.add(this.modelMapper.map(val, RoomsDTO.class));
			       }
			return listOfRoomsDto;
		}

}
