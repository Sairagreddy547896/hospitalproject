package com.hospital_system.repostiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital_system.entity.Rooms;


@Repository
public interface RoomsRepo extends JpaRepository<Rooms, Integer> {
	
	@Query("from Rooms where roomId=?1")
    public abstract Rooms getRoomById(Integer roomId);
	
	@Query("from Rooms")
	public abstract List<Rooms> getAll();
}
