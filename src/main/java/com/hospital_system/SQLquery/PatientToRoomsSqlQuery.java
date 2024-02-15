package com.hospital_system.SQLquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PatientToRoomsSqlQuery {

	  @Autowired
	  private JdbcTemplate jdbcTemplate;
	
	      public void addRoomsForPatient(Integer patientId,Integer roomId) {
	    	  
	    	  String Query="insert into rooms_alloted_for_patient values(?,?)";
	    	  
	    	      int result= this.jdbcTemplate.update(Query,patientId,roomId);
	    	  
	    	  System.out.println(result);           
	      }
	      
	      public void deleteRoomForPatient(Integer patientId,Integer roomId) {
	    	  
	    	  String sqlQuery="delete from rooms_alloted_for_patient where patient_patientid=? and rooms_room_id=?";
	    	  
	    	    @SuppressWarnings("unused")
				int  result=this.jdbcTemplate.update(sqlQuery,patientId,roomId);
	    	      
	    	      
	      }
	      
	      public void deletePatientFromRelation(Integer patientId) {
	    	  
	    	  String sqlQuery="delete from rooms_alloted_for_patient where patient_patientid=?";
	    	  
	    	          @SuppressWarnings("unused")
					int   result=this.jdbcTemplate.update(sqlQuery,patientId);
	      }
	      
}
