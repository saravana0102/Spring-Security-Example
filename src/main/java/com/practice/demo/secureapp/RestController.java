package com.practice.demo.secureapp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value= {"api"})
public class RestController {

	@GetMapping(value = "/public/guest", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String testGuest() {
		return "I am public end point";
	
	}
	
	@GetMapping(value = "/private/user", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String testPrivateUser() {
		return "I am private end point";
	
	}
}
