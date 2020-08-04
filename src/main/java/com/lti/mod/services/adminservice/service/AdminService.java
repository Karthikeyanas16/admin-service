package com.lti.mod.services.adminservice.service;

import java.math.BigInteger;

import com.lti.mod.services.adminservice.model.Technology;
import com.lti.mod.services.adminservice.model.User;

public interface AdminService {

	Object createTechnology(Technology technology);
	void deleteCourse(Long parseLong);
	Object createUser(User user);
	void deleteUser(BigInteger id);
	
}
