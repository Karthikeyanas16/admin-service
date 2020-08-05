package com.lti.mod.services.adminservice.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lti.mod.services.adminservice.model.Technology;
import com.lti.mod.services.adminservice.model.User;
import com.lti.mod.services.adminservice.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public ResponseEntity<?> findAllCourses() {
		System.out.println("Admin service ####");
		return new ResponseEntity<>(adminService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/users")
	public ResponseEntity<?> findAllUsers() {
		System.out.println("Search All Users ####");
		List<User> users = adminService.findAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/mentors")
	public ResponseEntity<?> findAllMentors() {
		System.out.println("Search All Mentors ####");
		List<User> users = adminService.findAllMentors();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@PostMapping("/course/create")
    public ResponseEntity<?> createCourse(@RequestBody Technology technology) {
		System.out.println("### Inside create course");
        return new ResponseEntity<>(adminService.createTechnology(technology), HttpStatus.CREATED);
    }
	
	@GetMapping("/course/delete/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long id) {
		System.out.println("### Inside delete course");
		adminService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
	
	/*
	 * @PostMapping("/user/create") public ResponseEntity<?> createUser(@RequestBody
	 * User user) { System.out.println("### Inside create user"); return new
	 * ResponseEntity<>(adminService.createUser(user), HttpStatus.CREATED); }
	 */
	
	@GetMapping("/user/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable BigInteger id) {
		System.out.println("### Inside delete user");
		adminService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
	
	
	
}
