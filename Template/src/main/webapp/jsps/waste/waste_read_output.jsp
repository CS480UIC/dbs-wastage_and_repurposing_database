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
	wasteid    :<input type="text" name="wasteid" value="${Waste.wasteid }" disabled/>
	<br/>	
	countyid：<input type="text" name="countyid" value="${Waste.countyid }" disabled/>
	<br/>
	totalwaste    :<input type="text" name="totalwaste" value="${Waste.totalwaste }" disabled/>
	<br/>
	dayofsample	：<input type="text" name="dayofsample" value="${Waste.dayofsample }" disabled/>
	<br/>
	organic	：<input type="text" name="organic" value="${Waste.organic }" disabled/>
	<br/>
    plastic	：<input type="text" name="plastic" value="${Waste.plastic }" disabled/>
	<br/>
	metal	：<input type="text" name="metal" value="${Waste.metal }" disabled/>
	<br/>
	glass	：<input type="text" name="glass" value="${Waste.glass }" disabled/>
	<br/>
	paper	：<input type="text" name="paper" value="${Waste.paper }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
