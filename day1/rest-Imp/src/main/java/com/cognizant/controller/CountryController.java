package com.cognizant.controller;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@GetMapping("/country")
	public Country getCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country)context.getBean("in", Country.class);
		return country;
	}
	
	@GetMapping("/countries")
	public ArrayList<Country> getCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> country = new ArrayList<Country>();
		country = context.getBean("countryList", java.util.ArrayList.class);
		return country;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) {
		Country country = null;
		try {
			country = CountryService.getCountry(code);
		} catch(countryNotFoundException e) {
			System.out.println("Country Not Found");
		}
		return country;
	}
	
}
