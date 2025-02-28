package com.Sachin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sachin.entity.AttendiesEntity;
import com.Sachin.entity.RegisterEntity;

import jakarta.transaction.Transactional;

@Transactional
public interface AttendiesRepo extends JpaRepository<AttendiesEntity, Integer>{

	AttendiesEntity  findByaEmail(String aEmail);

}
