package com.ripplestreet.userspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ripplestreet.userspringboot.dto.User;
import com.ripplestreet.userspringboot.service.UserService;


@RestController
@RequestMapping("/userapi")
public class UserController {
	@Autowired
	private UserService userService;


	@PostMapping("/users")
	public User save( @RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/users")
	public List<User> findAll(){
		return userService.findAll();
	}

	@GetMapping("/users/{id}")
	public User findById(@PathVariable int id) {
		return userService.findUser(id);
	}
	

	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
}
