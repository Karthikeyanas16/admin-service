package com.lti.mod.services.adminservice.service;

import java.math.BigInteger;
import java.util.List;

import com.lti.mod.services.adminservice.model.Technology;
import com.lti.mod.services.adminservice.model.TechnologyDto;
import com.lti.mod.services.adminservice.model.User;

public interface AdminService {
	List<TechnologyDto> findAll();
	Object createTechnology(Technology technology);
	void deleteCourse(Long parseLong);
	Object createUser(User user);
	void deleteUser(Long id);
	List<User> findAllUsers();
	List<User> findAllMentors();
}
