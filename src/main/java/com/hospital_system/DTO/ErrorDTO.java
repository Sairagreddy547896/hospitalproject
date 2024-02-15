package com.hospital_system.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDTO {

		private Integer statusCode;
		private String Errordescription;
		private String message;
		@JsonIgnore
		private Throwable cause;
		
	}



