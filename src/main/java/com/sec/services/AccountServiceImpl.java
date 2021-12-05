package com.sec.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sec.model.AppRole;
import com.sec.model.AppUser;
import com.sec.model.repository.RoleRepository;
import com.sec.model.repository.UserRepository;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {

@Autowired
private UserRepository userRepository;
@Autowired
private RoleRepository roleRepository;

@Override
public AppUser saveUser(AppUser user) {
// TODO Auto-generated method stub

return userRepository.save(user);
}
@Override
public AppRole saveRole(AppRole role) {
return roleRepository.save(role);
}
@Override
public void addRoleToUser(String username, String roleName) {
// TODO Auto-generated method stub
AppRole role=roleRepository.findByRoleName(roleName);
AppUser user = userRepository.findByUsername(username);
user.getRoles().add(role);
}
@Override
public AppUser findUserByUsername(String username) {
// TODO Auto-generated method stub
return userRepository.findByUsername(username);
}
}