package com.sayan.restWebservices.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEMO_USER")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="create_date")
	private Date create_date;
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.user_name = name;
		this.create_date = birthDate;
	}
	
	public User() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + user_name + ", birthDate=" + create_date + "]";
	}
}
