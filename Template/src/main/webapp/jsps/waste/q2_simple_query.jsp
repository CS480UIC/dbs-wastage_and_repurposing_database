<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> totalwaste and Countyid </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>countyid</th>
		<th>dayofsample</th>
		<th>totalwaste</th>
	</tr>
<c:forEach items="${WasteList}" var="waste">
	<tr>
		<td>${waste.countyid}</td>
		<td>${waste.dayofsample}</td>
		<td>${waste.totalwaste}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
