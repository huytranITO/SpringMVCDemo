package com.fa.repository;

import org.springframework.stereotype.Repository;

import com.fa.model.Fresher;

@Repository
public class FresherRepositoryImpl implements FresherRepository{

	@Override
	public boolean authenticate(Fresher fresher) {
		if (fresher.getUsername().equals(fresher.getPassword())) {
			return false;
		}
		return true;
	}

}
