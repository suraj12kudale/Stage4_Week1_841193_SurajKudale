package com.cognizant.controller;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryService {
	public static Country getCountry(String code) throws countryNotFoundException{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> country = new ArrayList<Country>();
		country = context.getBean("countryList", java.util.ArrayList.class);

		
			for(Country g : country) {
				if(g.getCode().equalsIgnoreCase(code)) {
					return g;
				} else {
					throw new countryNotFoundException();
				}
			}
			
		return null;
	}
}
