package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.Employee;
import com.mysql.jdbc.PreparedStatement;

public class InsertDatabase {
	
	public void employeeLogin(Employee employee) {
		
	Connection connection = null;
	PreparedStatement prepareStatement = null;
	String sql ="insert into employee(name,age,gender,salary,designation,skills,address) values(?,?,?,?,?,?,?)";
	
	
	System.out.println("Values recieved in JDBC ");
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/employees","root","root");
			
			prepareStatement = (PreparedStatement) connection.prepareStatement(sql);
			prepareStatement.setString(1, employee.getName());
			
			prepareStatement.setString(2, employee.getAge());
			prepareStatement.setString(3, employee.getGender());
			prepareStatement.setString(4, employee.getSalary());
			prepareStatement.setString(5, employee.getDesination());
			prepareStatement.setString(6, employee.getSkills());
			prepareStatement.setString(7, employee.getAddress());
			
			prepareStatement.executeUpdate();
			
			System.out.println("Values inserted in empdetails table");
		
			
		  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
