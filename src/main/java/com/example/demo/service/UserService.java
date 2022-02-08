package com.example.demo.service;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
@Configuration
public class UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
   
    
    @Autowired
    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository
                       ) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setActive(1);
        // Role userRole = roleRepository.findByRole("ADMIN");
        //user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

}/*package com.example.demo.service;


import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;

import configuration.WebMvcConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.HashSet;
@Service
//le service est crée pour crypter le mdp
public class UserService {
	private UserRepository userRepository;
	 private RoleRepository roleRepository;
	 
	 public User findUserByEmail(String email) {
	 return userRepository.findByEmail(email);
	 }
	 //cryptage du mdp ,mettre active a 1 et save
	
	 public void saveUser(User user) {
	 
	user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()))
	;
	 user.setActive(0);
	 Role userRole = roleRepository.findByRole("USER");
	 user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
	 userRepository.save(user);
	 }
	 */
