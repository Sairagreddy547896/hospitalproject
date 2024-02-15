package com.hospital_system.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital_system.DTO.MedicineDTO;
import com.hospital_system.entity.Medicine;
import com.hospital_system.repostiory.MedicineRepo;
import com.hospital_system.service.MedicineService;

@Component
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepo medicineRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String saveMedicine(MedicineDTO medicineDTO) {
		
		   Medicine medicine=  this.modelMapper.map(medicineDTO, Medicine.class);
		
		              medicineRepo.save(medicine);
		   
		return "successs";
	}

	@Override
	public MedicineDTO getMedicine(Integer medicineCode) {
		
		
		          Medicine   medicine=this.medicineRepo.getMedicineById(medicineCode);
		          
		          MedicineDTO medicineDto=this.modelMapper.map(medicine, MedicineDTO.class);
		          
		          
		 return medicineDto;
	}

	@Override
	public String deleteMedicine(Integer medicinecode) {
		// TODO Auto-generated method stub
		
		          this.medicineRepo.deleteById(medicinecode);
		          
		return "success";
	}

	@Override
	public List<MedicineDTO> getAllMedicine() {
		// TODO Auto-generated method stub
		
		    List<Medicine> listOfMedicine =this.medicineRepo.getAllMedicine();
		    
		    List<MedicineDTO>  listOfMedicineDto=new ArrayList<>();
		    
		       for(Medicine val:listOfMedicine) {
		    	  listOfMedicineDto.add(this.modelMapper.map(val, MedicineDTO.class));
		       }
		 
		return listOfMedicineDto;
	}

	

	
	
	
}
