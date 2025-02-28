package com.Shakthi.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shakthi.entity.AttendiesEntity;
import com.Shakthi.entity.RegisterEntity;
import com.Shakthi.repository.AttendiesRepo;
import com.Shakthi.serviceInterface.AttendiesService;

@Service
public class AttendiesServiceImpl implements AttendiesService{
	@Autowired
	private AttendiesRepo repo;
	
	
	@Override
	public Integer saveAttendie(AttendiesEntity entity) {
		// TODO Auto-generated method stub
		return repo.save(entity).getAId();
	}


	@Override
	public AttendiesEntity findbyEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
