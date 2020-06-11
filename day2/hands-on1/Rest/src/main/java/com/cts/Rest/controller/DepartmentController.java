package com.cts.Rest.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Rest.Service.DepartmentService;
import com.cts.Rest.model.Department;

@RestController
public class DepartmentController {
	@GetMapping("/departments")
	public ArrayList<Department> getAllDepartments() {
		return DepartmentService.getAllDepartments();
	}

}
