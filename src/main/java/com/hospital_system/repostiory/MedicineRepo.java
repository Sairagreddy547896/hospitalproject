package com.hospital_system.repostiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital_system.entity.Medicine;



@Repository
public interface MedicineRepo extends JpaRepository<Medicine, Integer> {
	
	
	 	@Query("from Medicine where medicineCode=?1")
	    public abstract Medicine getMedicineById(Integer medicineCode);
	 
	 	@Query("from Medicine")
	 	public abstract List<Medicine> getAllMedicine(); 

}
