package com.jsp.emp.service;

import java.util.List;

import com.jsp.emp.dao.EmployeeDao;
import com.jsp.emp.dto.Employee;

public class EmployeeService {
	EmployeeDao employeeDao = new EmployeeDao();

//	save
	public Employee saveEmployee(Employee employee) {
		if (employee.getName() != null && employee.getEmail() != null && employee.getGender() != null
				&& employee.getSalary() > 0) {
			return employeeDao.saveEmployee(employee);

		}
		return null;
	}

//	delete
	public boolean deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}

//	update
	
	public Employee updateEmployeeEmailbyId(int id,String email,String old_email) {
		Employee employee=employeeDao.getEmployeeById(id);
		if(employee.getEmail().equals(old_email)) {
			employee.setEmail(email);
			return employeeDao.updateEmployeeEmailById(employee);
		}
		return null;
	
	

	}
	

//	getall
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	


	
	
//	get by id

public Employee getEmployeeById(int id) {
	return employeeDao.getEmployeeById(id);
	
}
}	

