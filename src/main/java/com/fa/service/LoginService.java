package com.fa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.model.Fresher;
import com.fa.repository.FresherRepositoryImpl;

@Service
public class LoginService {
	@Autowired
	private FresherRepositoryImpl fresherRepository;
	
	public boolean authenticate(Fresher fresher) {
		return fresherRepository.authenticate(fresher);
	}
}
