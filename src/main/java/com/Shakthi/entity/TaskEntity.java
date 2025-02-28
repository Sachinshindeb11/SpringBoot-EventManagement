package com.Shakthi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Tasks")
public class TaskEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tId;
	private String bId;
	private String eName;
	private String eDate;
	private String eTime;
	private String eAddress;
	private String VenueManagement;
	private String LogisticsAndOperations;
	private String EntertainmentAndActivities;
	private String CateringAndHospitality;
}
