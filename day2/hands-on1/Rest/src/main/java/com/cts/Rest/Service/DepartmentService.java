package com.cts.Rest.Service;

import java.util.ArrayList;

import com.cts.Rest.dao.DepartmentDao;
import com.cts.Rest.model.Department;


public class DepartmentService {
	
	public static ArrayList<Department> getAllDepartments() {
		DepartmentDao depDao = new DepartmentDao();
		return depDao.getAllDepartments();
	}

}
