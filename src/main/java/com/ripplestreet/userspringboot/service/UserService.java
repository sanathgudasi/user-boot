package com.ripplestreet.userspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripplestreet.userspringboot.dao.UserRepo;
import com.ripplestreet.userspringboot.dto.User;
@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public User save(User user) {
		return userRepo.save(user);
	}
	
	public User findUser(int id) {
		return userRepo.findById(id).get();
	}
	
	public String deleteUser(int id) {
		userRepo.delete(userRepo.findById(id).get());
		return "user deleted";
	}
	
	public User updateuser(User user) {
		return userRepo.save(user);
	}
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
}
