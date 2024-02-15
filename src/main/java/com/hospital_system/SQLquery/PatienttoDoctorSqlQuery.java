package com.hospital_system.SQLquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PatienttoDoctorSqlQuery {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void adddoctorforpatient(Integer patientid,Integer employeeid) {
		
		String sqlQuery="insert into doctorschecked values(?,?)";
		    
		       @SuppressWarnings("unused")
			int result=  this.jdbcTemplate.update(sqlQuery,patientid,employeeid);
	   //System.out.println("result after storing data"+result);
		
	}
	
	public void deleteadoctorforpatient(Integer doctorId,Integer patientId) {
		String sqlQuery="delete from doctorschecked where patient_patientid=? and doctors_employeeid=?";
	    
	       @SuppressWarnings("unused")
		int result=  this.jdbcTemplate.update(sqlQuery,patientId,doctorId);
	       	//System.out.println("result after storing data"+result);
		
	}
	
	public void deletePatientFromRelation(Integer patientId) {
		String sqlQuery="delete from doctorschecked where patient_patientid=?";
	
		            @SuppressWarnings("unused")
					int result=this.jdbcTemplate.update(sqlQuery,patientId);
	}
	
}
