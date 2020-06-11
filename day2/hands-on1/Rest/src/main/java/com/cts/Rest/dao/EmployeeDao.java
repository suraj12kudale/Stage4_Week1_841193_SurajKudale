package com.cts.Rest.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.Rest.RestApplication;
import com.cts.Rest.model.Employee;


public class EmployeeDao {
	private final static Logger LOGGER = LoggerFactory.getLogger(RestApplication.class);
	
	public static ArrayList<Employee> Employee_list = new ArrayList<Employee>();
	
	public EmployeeDao() {
		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee_list = context.getBean("employeeList", java.util.ArrayList.class);
		LOGGER.debug("Employee : {}", Employee_list.toString());
		LOGGER.info("End");
	}
	
	public ArrayList<Employee> getAllEmployees() {
		return Employee_list;
	}

}
