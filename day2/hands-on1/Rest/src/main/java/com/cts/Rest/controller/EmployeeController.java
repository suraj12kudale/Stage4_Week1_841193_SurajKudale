package com.cts.Rest.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Rest.Service.EmployeeService;
import com.cts.Rest.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees() {
		return EmployeeService.getAllEmployees();
	}
}
