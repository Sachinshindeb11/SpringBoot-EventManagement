package com.Shakthi.serviceInterface;

import java.util.List;

import com.Shakthi.entity.AttendiesEntity;
import com.Shakthi.entity.RegisterEntity;


public interface AttendiesService {
	Integer saveAttendie(AttendiesEntity entity);
	AttendiesEntity findbyEmail(String email);
	
}
