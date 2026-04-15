package com.emp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.emp.util.*;
import com.emp.dto.*;

public class EmployeeDao {
	public boolean insertEmpData(EmployeeDto emp) throws ClassNotFoundException, SQLException {
		try {
			Connection connection = EmployeeUtil.establishConnection();
			String insertQuery = "insert into EmployeeDto values(?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setInt(1, emp.getId());
			statement.setString(2,emp.getName());
			statement.setInt(3, emp.getSalary());
			statement.setString(4, emp.getLoc());
			statement.setString(5, emp.getDept());
			statement.setInt(6, emp.getAge());
			java.sql.Date sqlDate = new java.sql.Date(emp.getDateOfJoin().getTime());
			statement.setDate(7, sqlDate);
			statement.executeUpdate();
			statement.close();
			connection.close();
			return true;
		}
		catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("Employee id already exists!");
			return false;
		}
					
	}
			

	//method to read data
	public List<EmployeeDto> readAllEmployees() throws ClassNotFoundException, SQLException{
		List<EmployeeDto> list = new ArrayList<EmployeeDto>();
		Connection establishConnection = EmployeeUtil.establishConnection();
		String readQuery = "select * from EmployeeDto";
		Statement st =establishConnection.createStatement();
		ResultSet executeQuery = st.executeQuery(readQuery);
		
		while(executeQuery.next()) {
			EmployeeDto emp=new EmployeeDto(
			executeQuery.getInt(1),
			executeQuery.getString(2),
			executeQuery.getInt(3),
			executeQuery.getString(4),
			executeQuery.getString(5),
			executeQuery.getInt(6),
			executeQuery.getDate(7));
			list.add(emp);
		}
		return list;
		
	}
	
	public void updateEmployee(EmployeeDto e) throws ClassNotFoundException, SQLException{
		Connection connection = EmployeeUtil.establishConnection();
		String updateQuery="update EmployeeDto set name=?,salary=?,loc=?,dept=?,age=?,DateOfJOin=? where id=?";
		PreparedStatement statement = connection.prepareStatement(updateQuery);
		statement.setString(1, e.getName());
		statement.setInt(2, e.getSalary());
		statement.setString(3, e.getLoc());
		statement.setString(4, e.getDept());
		statement.setInt(5, e.getAge());
		java.sql.Date sqlDate = new java.sql.Date(e.getDateOfJoin().getTime());
		statement.setDate(6, sqlDate);
		statement.setInt(7, e.getId());
		statement.executeUpdate();
		statement.close();
		connection.close();
		}
	
	public void deleteEmployee(int id) throws ClassNotFoundException, SQLException{
		Connection connection = EmployeeUtil.establishConnection();
		String deleteQuery = "delete from EmployeeDto where id = ?";
		PreparedStatement statement = connection.prepareStatement(deleteQuery);
		statement.setInt(1, id);
		statement.executeUpdate();
		statement.close();
		connection.close();
	}
}

	
