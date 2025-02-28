package com.Sachin.serviceInterface;

import java.util.List;

import com.Sachin.entity.AttendiesEntity;
import com.Sachin.entity.RegisterEntity;


public interface AttendiesService {
	Integer saveAttendie(AttendiesEntity entity);
	AttendiesEntity findbyEmail(String email);
	
}
