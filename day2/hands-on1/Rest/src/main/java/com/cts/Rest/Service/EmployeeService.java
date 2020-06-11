package com.cts.Rest.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cts.Rest.dao.EmployeeDao;
import com.cts.Rest.model.Employee;

@Service
public class EmployeeService {
	
	public static ArrayList<Employee> getAllEmployees() {
		EmployeeDao empDao = new EmployeeDao();
		return empDao.getAllEmployees();
	}

}
