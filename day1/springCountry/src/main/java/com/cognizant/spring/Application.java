package com.cognizant.spring;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		displayCountry();
		displayCountries();
		LOGGER.info("Hello");
	}
	
	public static void displayCountry() {
		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country)context.getBean("us", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		Country anotherCountry = context.getBean("in", Country.class);
		LOGGER.debug("Country : {}", anotherCountry.toString());
		LOGGER.info("End");
	}
	
	
	public static void displayCountries() {
		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> country = new ArrayList<Country>();
		country = context.getBean("countryList", java.util.ArrayList.class);
		LOGGER.debug("Country : {}", country.toString());
		LOGGER.info("End");
	}
	
}
