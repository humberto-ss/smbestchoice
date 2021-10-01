package com.supermarket.bestchoice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategorieResource {
	
	@GetMapping
	public String list() {
		return "Rest is working";
	}
}
