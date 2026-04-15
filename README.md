# Employee Management System using Java Servlets, JSP, JDBC & MySQL

##  Project Overview
This is a web-based Employee Management System developed using Java Servlets, JSP, JDBC, and MySQL following the MVC architecture.

The application allows users to perform complete CRUD operations (Create, Read, Update, Delete) on employee records through a clean and user-friendly interface.

## Features

-  Add Employee
-  View Employees
-  Update Employee Details
-  Delete Employee
-  Clean and responsive UI
-  Real-time data updates using JDBC
-  MVC architecture implementation

##  Technologies Used

- Java (Servlets, JSP)
- JDBC (Java Database Connectivity)
- MySQL Database
- HTML5, CSS3
- Apache Tomcat Server

##  Project Structure
EmployeeManagementSystem/
│
├── src/
│ ├── com.emp.controller (Servlets)
│ ├── com.emp.dao (Database operations)
│ ├── com.emp.dto (Data Transfer Objects)
│ └── com.emp.util (DB Connection)
│
├── webapp/
│ ├── index.jsp
│ ├── addemployee.jsp
│ ├── readallemployees.jsp
│ ├── updateemployee.jsp
│ └── css/
│ └── style.css
│
└── README.md

##  Database Setup

Create a database and table in MySQL:

sql
CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT,
    loc VARCHAR(50),
    dept VARCHAR(50),
    age INT,
    DateOfJoin DATE
);

How to Run the Project

Clone the repository:

git clone https://github.com/your-username/your-repo-name.git
Import the project into Eclipse / IntelliJ IDEA
Configure Apache Tomcat Server

Update database credentials in:

EmployeeUtil.java
Run the project on server

Open in browser:
http://localhost:8080/your-project-name/

Key Highlights
Implemented MVC architecture for better code organization
Built full CRUD functionality using Servlets and JDBC
Designed a modern and clean UI using CSS

Improved user experience with navigation and styling
 Future Enhancements
-> Add Login & Authentication
-> Search and Filter Employees
-> Dashboard Analytics
-> React Frontend Integration

Acknowledgement:

This project was built as part of my learning journey in Java Full Stack Development.

Connect with Me
LinkedIn: linkedin.com/in/onnurbee-dudekula
GitHub: https://github.com/onnur2711
