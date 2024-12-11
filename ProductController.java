package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	
	@GetMapping("/add-product")
	public String insertProduct() {
		return "add";
	}
	
	@PostMapping("/insert-product")
	public String addProduct() {
		System.err.println("We are in post method");
		return "add";
	}

}
