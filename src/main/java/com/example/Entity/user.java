package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
	@Id
	private Long Id;
	private String name ;
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(Long id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user [Id=" + Id + ", name=" + name + "]";
	}

	
	

}
