package com.hospital_system.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class DataSourceclass {
	
	@Autowired
	private Environment env;
	
	
	  @Bean
	  public DataSource datasource() {
		  
		  	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
	        dataSource.setUrl(env.getProperty("spring.datasource.url"));
	        dataSource.setUsername(env.getProperty("spring.datasource.username"));
	        dataSource.setPassword(env.getProperty("spring.datasource.password"));
	        return dataSource;
	  }
	
    @Bean
	public JdbcTemplate getconnection() {
		
    	
    	 JdbcTemplate   jdbcTemplate=new JdbcTemplate(datasource());
    	 
    	 return jdbcTemplate;
		
	}
	
	
	
	
	         
}
