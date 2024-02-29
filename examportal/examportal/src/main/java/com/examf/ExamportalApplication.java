package com.examf;

import com.examf.model.Role;
import com.examf.model.User;
import com.examf.model.UserRole;
import com.examf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {


		SpringApplication.run(ExamportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		//	User user = new User();
//user.setFirstName("Akshat");
//		user.setLastName("jain");
//		user.setUsername("aksh26");
//		user.setPassword("akki");
//		user.setEmail("akki@gmail.com");
//		user.setProfile("dp.png");


//		Role role1=new Role();
//		role1.setRoleId(1L);
//		role1.setRoleName("ADMIN");

//		Set<UserRole> userRoleSet= new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);

//		userRoleSet.add(userRole);
//	    User user1 = this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
//
	}
}
