package com.cts.Rest.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.Rest.RestApplication;
import com.cts.Rest.model.Department;


public class DepartmentDao {
	private final static Logger LOGGER = LoggerFactory.getLogger(RestApplication.class);
	
	public static ArrayList<Department> Department_list = new ArrayList<Department>();
	
	public DepartmentDao() {
		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Department_list = context.getBean("departmentList", java.util.ArrayList.class);
		LOGGER.debug("Employee : {}", Department_list.toString());
		LOGGER.info("End");
	}
	
	public ArrayList<Department> getAllDepartments() {
		return Department_list;
	}


}
