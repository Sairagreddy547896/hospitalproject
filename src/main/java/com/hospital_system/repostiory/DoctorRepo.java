package com.hospital_system.repostiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital_system.entity.Doctor;



@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
	
	
        @Query("from Doctor where employeeId=?1")
	    public abstract Doctor getDoctorById(Integer doctorId);
        
        
        @Query("from Doctor")
        public abstract List<Doctor> getAllDoctors();
}
