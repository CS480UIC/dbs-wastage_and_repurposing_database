<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Waste</title>
    
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
  <h1>Read Waste</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/WasteServletRead'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	Totalwaste：<input type="text" name="Totalwaste" value="${form.Totalwaste }"/>
	<span style="color: red; font-weight: 900">${errors.Totalwaste }</span>
	<br/>
	CountyID	：<input type="text" name="CountyID" value="${form.CountyID }"/>
	<span style="color: red; font-weight: 900">${errors.CountyID }</span>
	<br/>
	Organic	：<input type="text" name="Organic" value="${form.Organic }"/>
	<span style="color: red; font-weight: 900">${errors.Organic }</span>
	<br/>
	Plastic	：<input type="text" name="Plastic" value="${form.Plastic }"/>
	<span style="color: red; font-weight: 900">${errors.Plastic }</span>
	<br/>
	Metal	：<input type="text" name="Metal" value="${form.Metal }"/>
	<span style="color: red; font-weight: 900">${errors.Metal }</span>
	<br/>
	Glass	：<input type="text" name="Glass" value="${form.Glass }"/>
	<span style="color: red; font-weight: 900">${errors.Glass }</span>
	<br/>
	Paper	：<input type="text" name="Paper" value="${form.Paper }"/>
	<span style="color: red; font-weight: 900">${errors.Paper }</span>
	<br/>
<%-- 	Password：<input type="password" name="password" value="${form.password }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	Email	：<input type="text" name="email" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/> --%>
	<input type="submit" value="Read Waste"/>
</form>
  </body>
</html>
