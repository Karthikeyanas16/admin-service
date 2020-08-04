package com.lti.mod.services.adminservice.service;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mod.services.adminservice.model.Technology;
import com.lti.mod.services.adminservice.model.User;
import com.lti.mod.services.adminservice.repository.TechnologyRepository;
import com.lti.mod.services.adminservice.repository.UserRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	TechnologyRepository techRepo;
	
	@Autowired
	UserRepository userRepo;

	@Override
	public Object createTechnology(Technology technology) {
		return techRepo.save(technology);
	}
	@Override
	public void deleteCourse(Long parseLong) {
		techRepo.deleteById(parseLong);
	}
	@Override
	public Object createUser(User user) {
		return userRepo.save(user);
	}
	@Override
	public void deleteUser(BigInteger id) {
		userRepo.deleteById(id);
	}

	
}
