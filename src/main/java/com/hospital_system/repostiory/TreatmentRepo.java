package com.hospital_system.repostiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital_system.entity.Treatment;

@Repository
public interface TreatmentRepo extends JpaRepository<Treatment, Integer> {

	

    @Query("from Treatment where treatmentNumber=?1")
    public abstract Treatment getTreatmentById(Integer treatmentNumber);
    
    @Query("from Treatment")
    public abstract List<Treatment> getAll();
	
	
}
