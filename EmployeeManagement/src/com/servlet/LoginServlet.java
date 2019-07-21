package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.database.InsertDatabase;

@WebServlet(urlPatterns="/input")
public class LoginServlet extends HttpServlet {

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("servlet called");
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String salary = req.getParameter("salary");
		String designation = req.getParameter("designation");
		String skills = req.getParameter("skills");
		String address = req.getParameter("address");
        
		System.out.println(name+ " "+ age+" "+ gender+" "+salary+" "+ designation + " " 
							+ skills + " " + address );
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAge(age);
		emp.setGender(gender);
		emp.setSalary(salary);
		emp.setDesination(designation);
		emp.setSkills(skills);
		emp.setAddress(address);
		
		
	    InsertDatabase DB = new InsertDatabase();
	    DB.employeeLogin(emp);
		
	}
		    
}