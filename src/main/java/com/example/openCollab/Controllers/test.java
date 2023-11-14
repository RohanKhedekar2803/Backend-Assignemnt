package com.example.openCollab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.openCollab.Services.AuthenticateService;
import com.example.openCollab.WebSecurity.Models.AuthenticationRequest;
import com.example.openCollab.WebSecurity.Models.AuthenticationResponse;
import com.example.openCollab.WebSecurity.Models.RegisterRequest;

@RestController
@RequestMapping("home")
public class test {
	
	
	@Autowired
	private AuthenticateService service;
	
	@PostMapping("register")
	public ResponseEntity<AuthenticationResponse> auth(
			@RequestBody AuthenticationRequest request) {
				return ResponseEntity.ok(service.register(request));

	}
	
	@PostMapping("authenticate")
	public ResponseEntity<AuthenticationResponse> auth(
			@RequestBody RegisterRequest request) {
		System.out.print("user --->"+ request.getEmail() +"  "+request.getPassword());
				return ResponseEntity.ok(service.authenticate(request));
	}
}
