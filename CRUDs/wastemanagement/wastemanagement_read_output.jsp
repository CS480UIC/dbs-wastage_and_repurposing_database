<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read WasteManagement Output</title>
    
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
  <h1>Read WasteManagement Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	TotalWaste    :<input type="text" name="totalwaste" value="${wastemanagement.totalwaste }" disabled/>
	<br/>
	CountyID：<input type="text" name="countyid" value="${wastemanagement.countyid }" disabled/>
	<br/>
	Organic	：<input type="text" name="organic" value="${wastemanagement.organic }" disabled/>
	<br/>
	Plastic	：<input type="text" name="plastic" value="${wastemanagement.plastic }" disabled/>
	<br/>
	Metal	：<input type="text" name="metal" value="${wastemanagement.metal }" disabled/>
	<br/>
	Glass	：<input type="text" name="glass" value="${wastemanagement.glass }" disabled/>
	<br/>
	Paper	：<input type="text" name="paper" value="${wastemanagement.paper }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
