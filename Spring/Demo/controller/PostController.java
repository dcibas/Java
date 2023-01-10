package com.example.demo.com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
     // @GetMapping("/test")
     // public String getPerson() {
     //     return "ID: " + "1";
     // }
	
	@PostMapping("/test")
	@ResponseBody
	public String addPerson() { 
	    return "ID: " + "1" + " Name: " + "Tomas";
	}
	
     // @GetMapping("/test")
     // @ResponseBody
     // public String addPerson(@RequestParam String data) { 
     //     return data;
     // }
}

