package com.work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/amitava")
	public String callMe() {
		return "<body bgcolor='red' text='yellow'><h1>I am Spring Boot from Maven</h1></body>";

	}

	@GetMapping("/aws")
	public String callMe2() {
		return "<body bgcolor='yellow' text='red'><h1>I am Spring Boot from Maven Again...</h1></body>";

	}

}
