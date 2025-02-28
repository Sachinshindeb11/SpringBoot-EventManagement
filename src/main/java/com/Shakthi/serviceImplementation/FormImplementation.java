package com.Shakthi.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shakthi.entity.Form;
import com.Shakthi.repository.FormRepo;
import com.Shakthi.serviceInterface.FormService;

@Service
public class FormImplementation implements FormService {
	@Autowired
	FormRepo repo;

	@Override
	public int save(Form form) {
		return repo.save(form).getId();
	}

}
