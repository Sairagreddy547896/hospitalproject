package com.hospital_system.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hospital_system.DTO.RoomsDTO;

@Component
public interface RoomsService {
	
	
	
	public abstract String saveRooms(RoomsDTO roomsDto);
	
	public abstract String deleteRoom(Integer roomId);
	
	public abstract RoomsDTO getRoomById(Integer roomId);
	
	public abstract List<RoomsDTO> getAll();

}
