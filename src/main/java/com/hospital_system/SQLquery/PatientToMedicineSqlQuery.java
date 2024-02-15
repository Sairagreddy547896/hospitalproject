package com.hospital_system.SQLquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PatientToMedicineSqlQuery {

	
	       @Autowired
	       private JdbcTemplate jdbcTemplate;
	       
	       public void addMedicineForPatient(Integer patientId,Integer medicineCode) {
	    	   
	    	     String sqlQuery="insert into medicien_given_to_patient values(?,?)";
	    	     
	    	  @SuppressWarnings("unused")
			int   result=this.jdbcTemplate.update(sqlQuery,patientId,medicineCode);
	    	        
	       }
	       
	       public void deleteMedicineForPatient(Integer medicineCode,Integer patientId) {
	    	   
	    	     String sqlQuery="delete from medicien_given_to_patient where patient_patientid=? and medicine_medicine_code=?";
	    	     
	    	  @SuppressWarnings("unused")
			int   result=this.jdbcTemplate.update(sqlQuery,patientId,medicineCode);
	    	        
	       }
	       
	       public void deletePatientFromRelation(Integer patientId) {
	    	   
	    	         String sqlQuery="delete from medicien_given_to_patient where patient_patientid=?";
	    	         
	    	      @SuppressWarnings("unused")
				int   result=this.jdbcTemplate.update(sqlQuery,patientId);
	       }
	       
}
