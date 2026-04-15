package com.emp.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import com.emp.dao.EmployeeDao;
import com.emp.dto.EmployeeDto;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    EmployeeDao dao = new EmployeeDao();

    // LOAD DATA INTO FORM
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            List<EmployeeDto> list = dao.readAllEmployees();

            for (EmployeeDto e : list) {
                if (e.getId() == id) {
                    request.setAttribute("emp", e);
                }
            }

            RequestDispatcher rd = request.getRequestDispatcher("updateemployee.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE DATA
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("tbId"));
            String name = request.getParameter("tbName");
            int sal = Integer.parseInt(request.getParameter("tbSal"));
            String loc = request.getParameter("tbLoc");
            String dep = request.getParameter("tbDep");
            int age = Integer.parseInt(request.getParameter("tbAge"));
            Date date = java.sql.Date.valueOf(request.getParameter("tbDate"));

            EmployeeDto emp = new EmployeeDto(id, name, sal, loc, dep, age, date);

            dao.updateEmployee(emp);

            response.sendRedirect("employee");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}