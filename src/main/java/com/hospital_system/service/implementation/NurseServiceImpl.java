package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.NurseDTO;
import com.hospital_system.entity.Nurse;
import com.hospital_system.repostiory.NurseRepo;
import com.hospital_system.service.NurseService;


@Component
public class NurseServiceImpl implements NurseService {

	
	@Autowired
	private NurseRepo nurseRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String saveNurse(NurseDTO nurseDTO) {
		
		    Nurse nurse=  this.modelMapper.map(nurseDTO, Nurse.class);
		     nurseRepo.save(nurse);     
		return "success";
	}

	@Override
	public NurseDTO getNurse(Integer NurseId) {
		// TODO Auto-generated method stub
		
		          Nurse   nurse=this.nurseRepo.getNurseById(NurseId);
		          
		       NurseDTO  nurseDto=this.modelMapper.map(nurse, NurseDTO.class);
		       
		       
		return nurseDto;
	}

	@Override
	public String deleteNurse(Integer nurseId) {
		// TODO Auto-generated method stub
		
		                  this.nurseRepo.deleteById(nurseId);
		                  
		return "success";
	}

	@Override
	public List<NurseDTO> getAllNurse() {
		// TODO Auto-generated method stub
		
		                List<Nurse>  listOfNurse=this.nurseRepo.getAllNurse();
		              
		                List<NurseDTO>  listOfNurseDto=new ArrayList<>();
		                
		                for(Nurse val:listOfNurse) {
		                	listOfNurseDto.add(this.modelMapper.map(val, NurseDTO.class));
		               }
		return listOfNurseDto;
	}
}

	