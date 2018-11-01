package com.sayan.restWebservices.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sayan.restWebservices.model.User;
public interface UserRepository extends CrudRepository<User, Long>{

	List<User> findById(Integer id);
	//List<User> findByUser_name(String name);
	
}
