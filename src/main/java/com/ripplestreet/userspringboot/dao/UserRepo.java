package com.ripplestreet.userspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ripplestreet.userspringboot.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
