package com.hospital_system.SQLquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PatientToTreatmentSqlQuery {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addtreatmentforpatient(Integer patientid,Integer treatmentNumber) {
		
		String sqlQuery="insert into treatment_underwent values(?,?)";
		    
		       @SuppressWarnings("unused")
			int result=  this.jdbcTemplate.update(sqlQuery,patientid,treatmentNumber);
	   //System.out.println("result after storing data"+result);
		
	}
	
	public void deletetreatmentforpatient(Integer treatmentNumber,Integer patientId) {
		String sqlQuery="delete from treatment_underwent where patient_patientid=? and treatment_treatment_number=?";
	    
	       @SuppressWarnings("unused")
		int result=  this.jdbcTemplate.update(sqlQuery,patientId,treatmentNumber);
	       	//System.out.println("result after storing data"+result);
		
	}
	
	public void deletePatientFromRelation(Integer patientId) {
		String sqlQuery="delete from treatment_underwent where patient_patientid=?";
		  
		              @SuppressWarnings("unused")
					int  result=this.jdbcTemplate.update(sqlQuery,patientId);
	}

}
