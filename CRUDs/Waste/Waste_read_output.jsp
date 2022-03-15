<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Waste Output</title>
    
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
  <h1>Read Waste Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Totalwaste    :<input type="text" name="Totalwaste" value="${Waste.Totalwaste }" disabled/>
	<br/>
	
	CountyID：<input type="text" name="CountyID" value="${Waste.CountyID }" disabled/>
	<br/>
	Organic	：<input type="text" name="Organic" value="${Waste.Organic }" disabled/>
	<br/>
    Plastic	：<input type="text" name="Plastic" value="${Waste.Plastic }" disabled/>
	<br/>
	Metal	：<input type="text" name="Metal" value="${Waste.Metal }" disabled/>
	<br/>
	Glass	：<input type="text" name="Glass" value="${Waste.Glass }" disabled/>
	<br/>
	Paper	：<input type="text" name="Paper" value="${Waste.Paper }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
