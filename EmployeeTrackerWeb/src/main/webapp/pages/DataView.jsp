<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<h1>Employee Information </h1><div></div>
</head>
<body>
Employee Id: ${EmpData.id}<br>
Employee Name: ${EmpData.empName}<br>
Employee Depart: ${EmpData.empDep}<br>
<div></div>
<span>
<a href="/">Home</a>
<a href="DataAdd">Add</a>
<a href="Search">Search</a>
</span>

</body>
</html>