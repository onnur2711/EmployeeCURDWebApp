<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
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


<form action="employee" method="post">
    ID: <input type="number" name="tbId"><br>
    Name: <input type="text" name="tbName"><br>
    Salary: <input type="number" name="tbSal"><br>
    Location: <input type="text" name="tbLoc"><br>
    Dept: <input type="text" name="tbDep"><br>
    Age: <input type="number" name="tbAge"><br>
    DOJ: <input type="date" name="tbDate"><br>

    <button type="submit">Save</button>
</form>
</div></div>

</body>
</html>