package com.sayan.restWebservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sayan.restWebservices.dao.ItemsRepository;
import com.sayan.restWebservices.dao.UserRepository;
import com.sayan.restWebservices.model.Items;
import com.sayan.restWebservices.model.User;

@Controller
@RequestMapping(path="/userdb")
public class UserDBController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@RequestMapping(path="/getUser/{id}",method=RequestMethod.GET)
	public @ResponseBody List<User> getUser(@PathVariable int id) {
		return userRepository.findById(id);
	}
	
	/*@RequestMapping(path="/getUser/{name}",method=RequestMethod.GET)
	public @ResponseBody List<User> getUser(@PathVariable String name) {
		return userRepository.findByUser_name(name);
	}*/
	
	@RequestMapping(path="/user",method=RequestMethod.POST)
	public @ResponseBody User addUser(@RequestBody User user) {
		User returnedUser=userRepository.save(user);
		return returnedUser;
	}
	
	@RequestMapping(path="/items",method=RequestMethod.GET)
	public @ResponseBody List<Items> getAllItems(){
		return itemsRepository.findAll();
		//return list;
	}
	
	@RequestMapping(path="/items/{id}",method=RequestMethod.GET)
	public @ResponseBody Items getItemsById(@PathVariable Integer id){
		return itemsRepository.findById(id).get();
		//return list;
	}
	
	@RequestMapping(path="/items",method=RequestMethod.POST)
	public @ResponseBody Items addItem(@RequestBody Items item){
		return itemsRepository.save(item);
		//return list;
	}
}
