package com.hospital_system.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "patientid")
public class Patient extends PatientDetails  {



	private String patientFirstName;
	private String patientLastName;
	private String patientGender;
	private String patientAddress;
	private Long patientPrimaryContactNumber;
	private Long patientSecoundarycontactNumber;

	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name="roomsAllotedForPatient")
	private List<Rooms> rooms; 
	
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name="medicienGivenToPatient")
	private List<Medicine> medicine;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name="doctorschecked")
	private List<Doctor> doctors;
	
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name="treatmentUnderwent")
	private List<Treatment> treatment;
	
}
