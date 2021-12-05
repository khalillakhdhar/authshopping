package com.sec.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.AppRole;


public interface RoleRepository extends JpaRepository<AppRole, String> {
public AppRole findByRoleName(String roleName);
}