package com.arab.intern.controllers;

import java.util.HashMap;

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
		return ResponseEntity.ok(new HashMap<>());
	}
	
	@PostMapping(value = "/postData")
	public ResponseEntity<?> postData(@RequestParam String email, 
			@RequestParam String password) {
		return ResponseEntity.ok(new HashMap<>());
	}
	
}
