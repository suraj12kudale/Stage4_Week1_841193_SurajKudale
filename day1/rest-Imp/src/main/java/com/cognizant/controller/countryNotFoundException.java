package com.cognizant.controller;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Country not found")
public class countryNotFoundException extends RuntimeException {
	//System.out.println("Country not found");
}
