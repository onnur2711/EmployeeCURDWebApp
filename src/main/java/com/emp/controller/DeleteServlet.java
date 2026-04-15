package com.emp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.emp.dao.EmployeeDao;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    EmployeeDao dao = new EmployeeDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            dao.deleteEmployee(id);

            response.sendRedirect("employee");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("🔥 Delete servlet called");
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("🔥 ID received: " + id);
    }
}