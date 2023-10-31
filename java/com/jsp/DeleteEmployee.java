package com.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.emp.service.EmployeeService;

@WebServlet("/delete")
//action name
public class DeleteEmployee extends HttpServlet {

	EmployeeService employeeService = new EmployeeService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String num = req.getParameter("id");
		                              //action name="id"

		Integer id =Integer.parseInt(num);
		
		boolean e = employeeService.deleteEmployeeById(id);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
		requestDispatcher.include(req, resp);
	}
}

