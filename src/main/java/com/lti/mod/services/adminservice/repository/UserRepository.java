package com.lti.mod.services.adminservice.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.lti.mod.services.adminservice.model.User;

public interface UserRepository extends CrudRepository<User, BigInteger>{

}
