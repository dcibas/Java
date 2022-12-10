package com.example.demo.com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.com.example.demo.object.Temperature;
import com.example.demo.com.example.demo.service.TemperatureService;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

	@Autowired
	TemperatureService temperatureService;
		
//	@GetMapping("/celsius")
//	public Double CelsiusToFahrenheit(@RequestParam(name ="celsius")Double celsius) {
//		return temperatureService.convertCelsiusToFarenheit(celsius);
	
//	}
	
//	@GetMapping("/fahrenheit")
//	public Double FahrenheitToCelsius(@RequestParam(name ="fahrenheit")Double fahrenheit) {
//		return temperatureService.convertFahrenheitToCelsius(fahrenheit);
		
//	}
	
//	@PostMapping("/celsius")
//	public Double CelsiusToFahrenheit1(@RequestBody Temperature temperature) {
//		return temperature.getCelsius();
		
//	}
	
//	@PostMapping("/fahrenheit")
//	public Double FahrenheitToCelsius1(@RequestBody Temperature temperature) {
//		return temperature.getFahrenheit();
		
//	}
	
	@PostMapping("/converter")
	public Temperature convertTemp(@RequestBody Temperature temperature) {
		Double celsius = temperature.getCelsius();
		Double fahrenheit = temperature.getFahrenheit();

		if(celsius == null) {
			temperature.setCelsius(temperatureService.convertFahrenheitToCelsius(fahrenheit));
		} 
		
		if(fahrenheit == null) {
			temperature.setFahrenheit(temperatureService.convertCelsiusToFarenheit(celsius));
		}
			
		System.out.println("Fahrenheit: " + temperature.getFahrenheit());
		System.out.println("Celsius: " + temperature.getCelsius());
		return temperature;		
		
	}
	
}
