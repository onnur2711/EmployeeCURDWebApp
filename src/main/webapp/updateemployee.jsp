<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/style.css">
</head>
<body>
<%@ page import="com.emp.dto.EmployeeDto" %>

<%
EmployeeDto e = (EmployeeDto) request.getAttribute("emp");

if(e == null){
    out.println("❌ No employee data found");
    return;
}
%>

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



<h2>Update Employee</h2>

<form action="update" method="post">

ID: <input type="text" name="tbId" value="<%= e.getId() %>" readonly><br><br>

Name: <input type="text" name="tbName" value="<%= e.getName() %>"><br><br>

Salary: <input type="number" name="tbSal" value="<%= e.getSalary() %>"><br><br>

Location: <input type="text" name="tbLoc" value="<%= e.getLoc() %>"><br><br>

Dept: <input type="text" name="tbDep" value="<%= e.getDept() %>"><br><br>

Age: <input type="number" name="tbAge" value="<%= e.getAge() %>"><br><br>

DOJ: <input type="date" name="tbDate" value="<%= e.getDateOfJoin() %>"><br><br>

<button type="submit">Update</button>

</form>

<br>
<a href="employee"> Back</a>
</div>
</div>
</body>
</html>