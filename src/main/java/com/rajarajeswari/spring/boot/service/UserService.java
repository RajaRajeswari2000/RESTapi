package com.rajarajeswari.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajarajeswari.spring.boot.entity.User;
import com.rajarajeswari.spring.boot.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;

	public void saveDetails(User user) {
	     repo.save(user);
	}

}
