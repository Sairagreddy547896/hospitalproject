package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.TreatmentDTO;
import com.hospital_system.entity.Treatment;
import com.hospital_system.repostiory.TreatmentRepo;
import com.hospital_system.service.TreatmentService;

@Component
public class TreatmentServiceImpl implements TreatmentService {

	@Autowired
	private TreatmentRepo treatmentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String saveTreatment(TreatmentDTO treatmentDTO) {
		
			Treatment treatment=	this.modelMapper.map(treatmentDTO,Treatment.class);
		   
	        treatmentRepo.save(treatment);
	
	        return "success";
	}

	@Override
	public TreatmentDTO getTreatment(Integer treatmentNumber) {
		// TODO Auto-generated method stub
		
		       Treatment  treatment=this.treatmentRepo.getTreatmentById(treatmentNumber);
		                      
		       TreatmentDTO treatmentDto=this.modelMapper.map(treatment,TreatmentDTO.class );
		           
		return treatmentDto;
	}

	@Override
	public String deleteTreatment(Integer treatmentNumber) {
		// TODO Auto-generated method stub
		
		                 this.treatmentRepo.deleteById(treatmentNumber);
		return "success  ";
	}
	
	@Override
	public List<TreatmentDTO> getAll(){
		
		      List<Treatment>    listOfTreatment=this.treatmentRepo.getAll();
		      
		      List<TreatmentDTO>  listOfTreatmentDto=new ArrayList<>();
		      
		      for(Treatment val:listOfTreatment) {
		   listOfTreatmentDto.add(this.modelMapper.map(val, TreatmentDTO.class));
		      }
		      
		 return listOfTreatmentDto;
	}

	

}
