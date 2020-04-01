<%@page import="com.one.controller.EmployeeController"%>
<%@page import="com.one.repository.EmployeeRepository"%>
<%@page import="com.one.sourse.Sourse"%>
<%@page import="com.one.model.Employee"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<a href="/">Home</a>
	<h1>Employee Table</h1>
	<table>
		<tr>
			<th width="80">ID:</th>
			<th width="120">Name:</th>
			<th width="120">Department:</th>
		</tr>
		<c:forEach items="${EmpData}" var="data">
			<tr>
				<td>${data.id}</td>
				<td>${data.empName}</td>
				<td>${data.empDep}</td>
				<td><a href="<c:url value='/edit/${data.id}' />">Edit</a></td>
				<td><a href="<c:url value='/remove/${data.id}' />">Delete</a></td>

			</tr>

		</c:forEach>
	</table>
	
	<div></div>
	
	<a href="DataAdd">Add Employee</a>

</body>
</html>