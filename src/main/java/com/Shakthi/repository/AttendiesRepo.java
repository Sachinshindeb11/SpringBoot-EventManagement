package com.Shakthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Shakthi.entity.AttendiesEntity;
import com.Shakthi.entity.RegisterEntity;

import jakarta.transaction.Transactional;

@Transactional
public interface AttendiesRepo extends JpaRepository<AttendiesEntity, Integer>{

	AttendiesEntity  findByaEmail(String aEmail);

}
