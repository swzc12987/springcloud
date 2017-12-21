package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.dao.UserRepository;
import com.itmuch.cloud.entity.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/simple/{id}")
	public User findById(@PathVariable("id")Long id) {
		return userRepository.findOne(id);
	}
	
}