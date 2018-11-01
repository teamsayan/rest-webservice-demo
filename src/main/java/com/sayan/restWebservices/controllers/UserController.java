package com.sayan.restWebservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.restWebservices.dao.UserDAO;
import com.sayan.restWebservices.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(path="/users/getUser/{id}",method=RequestMethod.GET)
	public User getUser(@PathVariable int id) {
		return userDao.getUser(id);
	}
	
	@GetMapping(value="/users/allUsers")
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	@PostMapping(value="/users")
	public void createUser(@RequestBody User user) {
		User returnedUser=userDao.addUser(user);
	}

}
