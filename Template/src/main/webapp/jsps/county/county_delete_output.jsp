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
		<input type="hidden" name="CountyID" value="${County.CountyID }"/>
	CountyID    :<input type="text" name="CountyID" value="${County.CountyID }" disabled/>
	<br/>
	
	StateID：<input type="text" name="StateID" value="${County.StateID }" disabled/>
	<br/>
	CountyName	：<input type="text" name="CountyName" value="${County.CountyName }" disabled/>
	<br/>
	Population	：<input type="text" name="Population" value="${County.Population }" disabled/>
	<br/>
	<input type="submit" value="Delete County"/>
</form>

</body>
</html>
