package com.lti.mod.services.adminservice.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.lti.mod.services.adminservice.model.Technology;

public interface TechnologyRepository extends CrudRepository<Technology, BigInteger>{

	void deleteById(Long parseLong);

}
