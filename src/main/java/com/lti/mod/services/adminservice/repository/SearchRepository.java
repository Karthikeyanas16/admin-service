package com.lti.mod.services.adminservice.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.mod.services.adminservice.model.Technology;
import com.lti.mod.services.adminservice.model.TechnologyDto;
import com.lti.mod.services.adminservice.model.User;

public interface SearchRepository extends JpaRepository<Technology, BigInteger> {

    @Query(value = "select t.id,t.technology, t.description,t.Status,t.Fees, c.name "
            +" from Technology t join User c on t.id = c.technology_id where c.status = 0" ,nativeQuery = true)
    List findAllData();


}
