<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete County</title>
    
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
  <h1>Delete County</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/CountyServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="countyid" value="${County.countyid }"/>
	countyid    :<input type="text" name="countyid" value="${County.countyid }" disabled/>
	<br/>
	
	stateid：<input type="text" name="stateid" value="${County.stateid }" disabled/>
	<br/>
	countyname	：<input type="text" name="countyname" value="${County.countyname }" disabled/>
	<br/>
	population	：<input type="text" name="population" value="${County.population }" disabled/>
	<br/>
	<input type="submit" value="Delete County"/>
</form>

</body>
</html>
