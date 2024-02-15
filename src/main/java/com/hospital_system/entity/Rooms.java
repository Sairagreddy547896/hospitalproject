package com.hospital_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Rooms {

	
	@Id
	private Integer roomId;
	private String roomType;
	private Double roomPriceforday;
	
}
