<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create State</title>
    
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
  <h1>Create State</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">
	ID    :<input type="text" name="id" value="${form.id }"/>
	<span style="color: red; font-weight: 900">${errors.id }</span>
	<br/>
	StateName    ：<input type="text" name="statename" value="${form.statename }"/>
	<span style="color: red; font-weight: 900">${errors.statename }</span>
	<br/>
	NumberOfCounties    ：<input type="text" name="numberofcounties" value="${form.numberofcounties }"/>
	<span style="color: red; font-weight: 900">${errors.numberofcounties }</span>
	<br/>
	<input type="submit" value="Create State"/>
</form>
  </body>
</html>
