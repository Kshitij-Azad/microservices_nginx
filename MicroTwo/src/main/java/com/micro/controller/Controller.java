package com.micro.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	@GetMapping("/")
	public String microOne()
	{
		return "Hello I am Micro Two";
	}
}
