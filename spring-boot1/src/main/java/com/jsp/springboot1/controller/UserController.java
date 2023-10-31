package com.jsp.springboot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot1.dto.Login;
import com.jsp.springboot1.dto.ResponseStructure;
import com.jsp.springboot1.dto.User;
import com.jsp.springboot1.exception.NoSuchUserIdFoundException;
import com.jsp.springboot1.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/user")
	public ResponseStructure<User> saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/user/{id}")
	public ResponseStructure<User> getUserById(@PathVariable int id)
			throws NoSuchUserIdFoundException {		
		return userService.getUserById(id);
	}

	@GetMapping("/user")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@DeleteMapping("user/{id}")
	public boolean deleteUserById(@PathVariable int id) {
		return userService.deleteUserById(id);
	}

	@PutMapping("/user/{id}")
	public User updateUserById(@PathVariable int id, @RequestBody User user) {
		return userService.updateUserById(id, user);
	}

	@PostMapping("/user/login")
	public boolean validateUser(@RequestBody Login login) {
		User u =  userService.validateUser(login.getEmail(), login.getPassword());
		if(u!=null) {
			return true;
		}
		else {
			return false;
		}
	}

}
