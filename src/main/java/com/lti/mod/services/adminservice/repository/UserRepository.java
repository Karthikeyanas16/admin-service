package com.lti.mod.services.adminservice.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lti.mod.services.adminservice.model.User;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, BigInteger> {
  // User findById(String id);

    @Query(value = "SELECT * from User e where e.role =:role", nativeQuery = true)
    List<User> findUsers(@Param("role") String role);

   @Query(value = "SELECT * from User e where e.role =:role", nativeQuery = true)
    List<User> findMentors(@Param("role") String role);

  //  @Query(value = "select t.id,t.technology, t.description,t.Status,t.Fees, c.name,c.id,c.email,c.role,c.status"
     //       +" from Technology t join User c on t.id = c.technology_id where c.role = 'mentor'" ,nativeQuery = true)
   // List findMentors();

}
