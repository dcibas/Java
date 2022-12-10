package com.example.demo.com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
	
//	public Integer temperatureSercive() {
//		return null;
//		
//	}
	
	public Double convertFahrenheitToCelsius(Double fahrenheit)
	{
		return (fahrenheit - 32) * .5556;
	}
	public Double convertCelsiusToFarenheit(Double celsius) {
		return (celsius * 1.8) + 32;
		
	}
}
