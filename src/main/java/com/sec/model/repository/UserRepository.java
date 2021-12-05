package com.sec.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.AppUser;


public interface UserRepository extends JpaRepository<AppUser, String> {
public AppUser findByUsername(String username);
}
