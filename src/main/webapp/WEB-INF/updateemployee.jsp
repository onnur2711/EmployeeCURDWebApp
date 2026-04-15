<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.emp.dto.EmployeeDto" %>

<%
EmployeeDto e = (EmployeeDto) request.getAttribute("emp");
%>

<form action="update" method="post">

ID: <input type="text" name="tbId" value="<%= e.getId() %>" readonly><br>
Name: <input type="text" name="tbName" value="<%= e.getName() %>"><br>
Salary: <input type="number" name="tbSal" value="<%= e.getSalary() %>"><br>
Location: <input type="text" name="tbLoc" value="<%= e.getLoc() %>"><br>
Dept: <input type="text" name="tbDep" value="<%= e.getDept() %>"><br>
Age: <input type="number" name="tbAge" value="<%= e.getAge() %>"><br>
DOJ: <input type="date" name="tbDate" value="<%= e.getDateOfJoin() %>"><br>

<button type="submit">Update</button>

</form>

</body>
</html>