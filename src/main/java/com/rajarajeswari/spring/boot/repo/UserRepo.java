package com.rajarajeswari.spring.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajarajeswari.spring.boot.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	

}
