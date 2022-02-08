package com.example.demo.controllers;
/*
import java.security.Principal;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.AuthenticationBean;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;
 

@CrossOrigin(origins = "*")
@RestController
public class BasicAuthRestController {
	 @Autowired
	 private UserService userService;
	 @GetMapping(path ="/basicauth")
	 public User basicauth() {
		 //recuperer le user a partir de l objet authentication
		 Principal auth =SecurityContextHolder.getContext().getAuthentication();
		 User user = userService.findUserByEmail(auth.getName());
		 return user;
	 }
}*/
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.AuthenticationBean;
import com.example.demo.entities.User;
import org.springframework.security.core.context.SecurityContextHolder;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

@CrossOrigin(origins = "*")
@RestController
public class BasicAuthRestController {
	@Autowired
	private UserService userService;

	@GetMapping(path = "/basicauth")
 
	public User basicauth() {
		// return "User Amine : Role Admin";
		// return new User("ma@gmail.com","1234");
		// return "Success";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		return user;
	}
}

	/*
	 * public Authentication basicauth() { return new Authentication("Spring");
	 * //return "Success"; }
	 */
 