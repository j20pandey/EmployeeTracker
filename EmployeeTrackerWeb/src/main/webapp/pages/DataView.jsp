<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>

<h1>Employee Information</h1>

<table>
  <tr>
    <th>Employee Id</th>
    <th>Employee Name</th>
    <th>Employee Department</th>
  </tr>
  <tr>
    <td>${EmpData.id}</td>
    <td>${EmpData.empName}</td>
    <td>${EmpData.empDep}</td>
  </tr>
</table>
<%-- Employee Id: ${EmpData.id}<br>
Employee Name: ${EmpData.empName}<br>
Employee Depart: ${EmpData.empDep}<br> --%>
<div></div>
<span>
<a href="/">Home</a>
<a href="DataAdd">Add</a>
<a href="Search">Search</a>
</span>

</body>
</html>