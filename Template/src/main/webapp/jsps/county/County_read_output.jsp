<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read County Output</title>
    
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
  <h1>Read county Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	CountyID    :<input type="text" name="id" value="${County.CountyID }" disabled/>
	<br/>
	StateID：<input type="text" name="stateid" value="${County.StateID }" disabled/>
	<br/>
	CountyName	：<input type="text" name="countyname" value="${County.CountyName }" disabled/>
	<br/>
	Population	：<input type="text" name="population" value="${County.Population }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
