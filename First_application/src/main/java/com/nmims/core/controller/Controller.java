package com.nmims.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Controller {
	
	@GetMapping("message")
	public String test() {
		return "Hello this is our first spring boot application";
	}

}
