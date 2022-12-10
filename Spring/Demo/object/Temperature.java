package com.example.demo.com.example.demo.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Temperature {

	Double Fahrenheit;
	Double Celsius;
	public Double getFahrenheit() {
		return Fahrenheit;
	}
	public void setFahrenheit(Double fahrenheit) {
		Fahrenheit = fahrenheit;
	}
	public Double getCelsius() {
		return Celsius;
	}
	public void setCelsius(Double celsius) {
		Celsius = celsius;
	}
	
}
