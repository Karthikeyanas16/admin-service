package com.lti.mod.services.adminservice.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import com.lti.mod.services.adminservice.model.TechnologyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mod.services.adminservice.model.Technology;
import com.lti.mod.services.adminservice.model.User;
import com.lti.mod.services.adminservice.repository.TechnologyRepository;
import com.lti.mod.services.adminservice.repository.UserRepository;
import com.lti.mod.services.adminservice.repository.SearchRepository;
@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	TechnologyRepository techRepo;
	
	@Autowired
	UserRepository userRepo;

	@Autowired
	SearchRepository searchRepository;

	@Override
	public List<TechnologyDto> findAll() {
		List list = searchRepository.findAllData();
		List<TechnologyDto> listdata = new ArrayList<TechnologyDto>();
		System.out.println("list "+list.toString());
		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object[] object = (Object[]) it.next();
			TechnologyDto dto = new TechnologyDto();
			dto.setId((BigInteger) object[0]);
			dto.setTechnology((String) object[1]);
			dto.setDescription((String) object[2]);
			dto.setStatus((String) object[3]);
			dto.setFees((BigInteger) object[4]);
			dto.setName((String) object[5]);
			listdata.add(dto);
		}

		return listdata;
	}

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


	@Override
	public List<User> findAllUsers() {
		return (List<User>) userRepo.findUsers("user");
	}

	@Override
	public List<User> findAllMentors() {
		List list = userRepo.findMentors("mentor");
		return list;
	}
}
