package com.sayan.restWebservices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sayan.restWebservices.model.User;

@Repository
public class UserDAO {

	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 5;
	
	static {
		users.add(new User(1,"Sayan", new Date()));
		users.add(new User(2,"Sayan2", new Date()));
		users.add(new User(3,"Sayan3", new Date()));
		users.add(new User(4,"Sayan4", new Date()));
		users.add(new User(5,"Sayan5", new Date()));
	}
	
	public User getUser(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User addUser(User user) {
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
}
