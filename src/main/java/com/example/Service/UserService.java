package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.user;
import com.example.Repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	

	public user make(user user) {
		return userRepository.save(user);
	}


	public user get(long id) {
		
		return userRepository.getById(id);
	}

}
