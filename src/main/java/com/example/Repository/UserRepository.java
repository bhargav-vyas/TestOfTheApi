package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.user;

public interface UserRepository extends JpaRepository<user, Long> {
	

}
