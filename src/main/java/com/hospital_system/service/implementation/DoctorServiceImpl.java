package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.DoctorDTO;
import com.hospital_system.entity.Doctor;
import com.hospital_system.repostiory.DoctorRepo;
import com.hospital_system.service.DoctorService;

@Component
public class DoctorServiceImpl implements DoctorService  {

	@Autowired
	private DoctorRepo doctorRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String saveDoctor(DoctorDTO doctorDTO) {
		
		
	Doctor doctor=	this.modelMapper.map(doctorDTO, Doctor.class);
	
	           this.doctorRepo.save(doctor);
	           return "success";
	}

	@Override
	public DoctorDTO getdoctor(Integer doctorId) {
		
		
		      Doctor doctor=   this.doctorRepo.getDoctorById(doctorId);
		              
		      DoctorDTO doctorDTO=this.modelMapper.map(doctor, DoctorDTO.class);
		              
		return doctorDTO;
	}

	@Override
	public String deleteDoctor(Integer doctorId) {
		                    
		              this.doctorRepo.deleteById(doctorId);
		return "success";
	}

	@Override
	public List<DoctorDTO> getalldoctors() {
		// TODO Auto-generated method stub
		
		     List<Doctor>  listOfDoctors =this.doctorRepo.getAllDoctors();
		     
		     List<DoctorDTO>  listOfDoctorsDto=new ArrayList<>();
		     
		     for(Doctor val:listOfDoctors) {
		    	 
		    	    listOfDoctorsDto.add(this.modelMapper.map(val, DoctorDTO.class));
		     }
		     
		return listOfDoctorsDto;
	}

}
