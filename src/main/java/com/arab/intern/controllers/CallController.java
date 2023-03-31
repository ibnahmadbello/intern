package com.arab.intern.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {

	@GetMapping(value = "/getData")
	public void getData() {}
	
	@PostMapping(value = "/postData")
	public String postData() {
		return "Post Data";
	}
	
}
