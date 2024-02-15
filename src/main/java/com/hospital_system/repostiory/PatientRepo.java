package com.hospital_system.repostiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital_system.entity.Doctor;
import com.hospital_system.entity.Medicine;
import com.hospital_system.entity.Patient;
import com.hospital_system.entity.Rooms;
import com.hospital_system.entity.Treatment;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {
   
	
	@Query("select doctors from Patient p inner join p.doctors where p.patientId=?1")
	public abstract  List<Doctor> getDoctorsForPatient(Integer patientId); 
	
	
	@Query("from Patient where patientId=?1")
    public abstract Patient getPatientById(Integer patientId);
	
	@Query("select medicine from Patient p inner join p.medicine where p.patientId=?1")
	public abstract List<Medicine> getMedicineOfPatient(Integer patientId);
	
	@Query("select treatment from Patient p inner join p.treatment where p.patientId=?1")
	public abstract List<Treatment> getTreatmentOfPatient(Integer patientId);
	
	@Query("select rooms from Patient p inner join p.rooms where p.patientId=?1")
	public abstract List<Rooms> getRoomsOfPatient(Integer patientId);
	
	@Query("from Patient")
	public abstract List<Patient> getAll();
	
	
	
}
