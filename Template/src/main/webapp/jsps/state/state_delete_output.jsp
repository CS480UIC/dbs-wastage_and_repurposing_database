<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete State</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Delete State</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/StateServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="stateid" value="${state.stateid }"/>
	ID    :<input type="text" name="stateid" value="${state.stateid }" disabled/>
	<br/>
	
	StateName    ：<input type="text" name="statename" value="${state.statename }" disabled/>
	<br/>
	NumberOfCounties    ：<input type="text" name="numberofcounties" value="${state.numberofcounties }" disabled/>
	<br/>
	<input type="submit" value="Delete State"/>
</form>

</body>
</html>
