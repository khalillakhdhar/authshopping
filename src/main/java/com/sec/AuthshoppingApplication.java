package com.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sec.model.AppRole;
import com.sec.model.AppUser;
import com.sec.services.AccountServiceImpl;

@SpringBootApplication
public class AuthshoppingApplication  implements CommandLineRunner {
	@Autowired
	AccountServiceImpl accountService;
	public static void main(String[] args) {
		SpringApplication.run(AuthshoppingApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBCPE() {
	return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		accountService.saveUser(new AppUser("admin", "1234",1,null));
		accountService.saveUser(new AppUser("user", "1234",1,null));
		accountService.saveRole(new AppRole("ADMIN"));
		accountService.saveUser(new AppUser("vendeur", "4567",1,null));

		accountService.saveRole(new AppRole("USER"));
		accountService.addRoleToUser("admin", "ADMIN");
		accountService.saveRole(new AppRole("Vendeur"));

		
		accountService.addRoleToUser("user", "USER");
	}

}
