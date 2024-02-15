package com.hospital_system.repostiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital_system.entity.Nurse;

@Repository
public interface NurseRepo extends JpaRepository<Nurse, Integer> {
	

    @Query("from Nurse where employeeId=?1")
    public abstract Nurse getNurseById(Integer nurseId);
    
    @Query("from Nurse")
    public abstract List<Nurse> getAllNurse();
 
}
