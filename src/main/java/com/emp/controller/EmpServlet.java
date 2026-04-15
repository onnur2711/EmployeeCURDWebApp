package com.emp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.emp.dao.EmployeeDao;
import com.emp.dto.EmployeeDto;


//@WebServlet("/addemployee")
//public class EmpServlet extends HttpServlet {
//	EmployeeDto emp;
//	EmployeeDao dao =new EmployeeDao();
//
//	
//	
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//calling Dao layer readall method
//		try {
//			List<EmployeeDto> emplist = dao.readAllEmployees();
//			request.setAttribute("allemplist", emplist);
//			RequestDispatcher requestDispatcher = request.getRequestDispatcher("readallemployees.jsp");
//			requestDispatcher.forward(request,response);
//		}catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int id = Integer.parseInt(request.getParameter("tbId"));
//		String name = request.getParameter("tbName");
//		int sal = Integer.parseInt(request.getParameter("tbSal"));
//		String loc = request.getParameter("tbLoc");
//		String dep = request.getParameter("tbDep");
//		int age = Integer.parseInt(request.getParameter("tbAge"));
//		String datestr=	request.getParameter("tbDate");
//		Date date=java.sql.Date.valueOf(datestr);
//
//		request.getParameter("tbDate");
//		emp=new EmployeeDto(id,name,sal,loc,dep,age,date);
//		try {
//			dao.insertEmpData(emp);
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//	doGet(request,response);
//
//		
//
//
//	}
//
//}

@WebServlet("/employee")
public class EmpServlet extends HttpServlet {

    EmployeeDao dao = new EmployeeDao();

    // READ ALL
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<EmployeeDto> emplist = dao.readAllEmployees();
            request.setAttribute("allemplist", emplist);
            RequestDispatcher rd = request.getRequestDispatcher("readallemployees.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CREATE
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("tbId"));
            String name = request.getParameter("tbName");
            int sal = Integer.parseInt(request.getParameter("tbSal"));
            String loc = request.getParameter("tbLoc");
            String dep = request.getParameter("tbDep");
            int age = Integer.parseInt(request.getParameter("tbAge"));
            String datestr = request.getParameter("tbDate");

            Date date = java.sql.Date.valueOf(datestr);

            EmployeeDto emp = new EmployeeDto(id, name, sal, loc, dep, age, date);
            dao.insertEmpData(emp);

            response.sendRedirect("employee"); // refresh list

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}