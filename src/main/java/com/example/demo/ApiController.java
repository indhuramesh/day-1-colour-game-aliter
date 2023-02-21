package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{
	private String favColor="Violet";
	@GetMapping("/display")
	public String getMyFav() {
		return "My Favourite Color is "+favColor;
	}
}