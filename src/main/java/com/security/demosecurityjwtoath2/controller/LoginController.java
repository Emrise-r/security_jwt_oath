package com.security.demosecurityjwtoath2.controller;


import com.security.demosecurityjwtoath2.model.User;

import com.security.demosecurityjwtoath2.model.response.JwtResponse;
import com.security.demosecurityjwtoath2.repository.UserRepository;
import com.security.demosecurityjwtoath2.service.Jwt.JwtService;
import com.security.demosecurityjwtoath2.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtService jwtService;

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtService.generateTokenLogin(authentication);

        UserDetails userdetails = (UserDetails) authentication.getPrincipal();

        User currentuser = userRepository.findByName(user.getName());

        return ResponseEntity.ok(new JwtResponse(currentuser.getId(), jwt, userdetails.getUsername(), userdetails.getAuthorities()));

    }
}
