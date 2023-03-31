package com.arab.intern.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {

	@GetMapping(value = "/getData")
	public ResponseEntity<?> getData(@RequestParam String email, 
			@RequestParam String password) {
		ResponseEntity<?> response = null;
		try {
			if(email.isEmpty() || password.isEmpty()) {
				throw new RuntimeException("One of the parameters is not valid");
			}
			response = new ResponseEntity<>(new HashMap<>(), HttpStatus.OK);
		}
		catch (Exception e) {
			response = new ResponseEntity<String>("This is a server error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@PostMapping(value = "/postData")
	public ResponseEntity<?> postData(@RequestParam String email, 
			@RequestParam String password) {
		ResponseEntity<?> response = null;
		try {
			if(email.isEmpty() || password.isEmpty()) {
				throw new RuntimeException("One of the parameters is not valid");
			}
			response = new ResponseEntity<>(new HashMap<>(), HttpStatus.OK);
		}
		catch (Exception e) {
			response = new ResponseEntity<String>("This is a server error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
}
