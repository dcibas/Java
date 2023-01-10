package com.example.demo.com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.com.example.demo.object.TodoTask;
import com.example.demo.com.example.demo.service.MathService;

@RestController
@RequestMapping("/math")
public class MathController {

	@Autowired
	MathService mathService;
	
	
	@GetMapping("/test")
	public String helloSprings() {	
	     // mathService.testService();
	     // TodoTask task = new TodoTask("Title","Content");
		return "Hello Spring Again!";		
	}
	
	@PostMapping("/testas")
	public String helloSpringsPost() { 
	    return "Hello Spring Post";
	}
	
	@GetMapping("/testmathqueryparam")
	public Integer helloSpringMathPost(@RequestParam Integer data1, @RequestParam Integer data2, @RequestParam String sign) { 
		
		switch(sign) {
		case "+":
			return data1 + data2;
		case "-":
			return data1 - data2;
		case "*":
			return data1 * data2;
		case "/":
			return data1 / data2;
		}
		
		return data1 + data2;
	}
	
	@GetMapping("/testpathvariable/{numberone}/{numbertwo}")
	public Integer helloSpringWithPathVariable(@PathVariable Integer numberone, @PathVariable Integer numbertwo) {
		return mathService.mathSercive(numberone, numbertwo);
	     // return numberone + numbertwo;
	}

	@GetMapping("/calculator/{numberone}/{sign}/{numbertwo}")
	public Integer calculator(@PathVariable Integer numberone,@PathVariable String sign,@PathVariable Integer numbertwo) {

		switch(sign) {
		case "+":
			return numberone + numbertwo;
		case "-":
			return numberone - numbertwo;
		case "*":
			return numberone * numbertwo;
		case "/":
			return numberone / numbertwo;
		default:
			return null;

		}
	}
}
