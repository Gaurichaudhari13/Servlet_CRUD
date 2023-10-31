package com.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.emp.dto.Employee;
import com.jsp.emp.service.EmployeeService;

@WebServlet("/update")
public class UpdateEmployee extends HttpServlet {

	EmployeeService employeeService = new EmployeeService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empid = req.getParameter("empid");
		String old_email=req.getParameter("oldemail");
		String new_email=req.getParameter("newemail");
		int id=Integer.parseInt(empid);
		
		
		Employee employee=employeeService.updateEmployeeEmailbyId(id, new_email, old_email);
		if(employee!=null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
			
		}else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("update.jsp");
			requestDispatcher.include(req, resp);
			
		}
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
//
}
