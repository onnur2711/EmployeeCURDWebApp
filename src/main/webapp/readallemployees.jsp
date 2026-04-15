<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.emp.dto.EmployeeDto" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employees</title>
<link rel="stylesheet" href="CSS/style.css">



</head>

<body>

<div class="navbar">
    <div class="nav-title">Employee Management System</div>

    <div class="nav-links">
        <a class="nav-home" href="index.jsp">Home</a>
        <a class="nav-view" href="employee">View Employees</a>
        <a class="nav-add" href="addemployee.jsp">Add Employee</a>
    </div>
</div>




<div class="container">
    <div class="card">


<h2>All Employees</h2>

<a href="addemployee.jsp" class="add-btn"> Add Employee</a>
<a href="index.jsp" class="back-btn"> Back to Dashboard</a>

<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Salary</th>
<th>Loc</th>
<th>Dept</th>
<th>Age</th>
<th>DOJ</th>
<th>Action</th>
</tr>

<%
List<EmployeeDto> list = (List<EmployeeDto>) request.getAttribute("allemplist");

if(list != null){
    for(EmployeeDto e : list){
%>

<tr>
<td><%= e.getId() %></td>
<td><%= e.getName() %></td>
<td><%= e.getSalary() %></td>
<td><%= e.getLoc() %></td>
<td><%= e.getDept() %></td>
<td><%= e.getAge() %></td>
<td><%= e.getDateOfJoin() %></td>
<td>
    <a class="warning" href="update?id=<%= e.getId() %>"> Edit</a>

    <a class="danger" href="delete?id=<%= e.getId() %>"
       onclick="return confirm('Delete this employee?')">
        Delete
    </a>
</td>
</tr>

<%
    }
}
%>

</table>

</div>
</div>
</body>
</html>