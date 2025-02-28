package com.Shakthi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Shakthi.entity.TaskEntity;

public interface TaskRepo extends JpaRepository<TaskEntity, Integer>{
	
	@Query("select t from TaskEntity t where bId=:id")
	TaskEntity findTaskByBId(String id);
	
	@Query("select t from TaskEntity t where (VenueManagement=:aId) or (LogisticsAndOperations=:aId) or (CateringAndHospitality=:aId) or (EntertainmentAndActivities=:aId) ")
	List<TaskEntity> getTaskByIdEmail(int aId);



}
