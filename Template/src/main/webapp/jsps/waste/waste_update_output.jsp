<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Waste</title>
    
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
  <h1>Update Waste</h1>
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
<h1>Update the values below</h1>
<form action="<c:url value='/WasteServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>	
	wasteid：<input type="text" name="wasteid" value="${form.wasteid }"/>
	<span style="color: red; font-weight: 900">${errors.wasteid }</span>
	<br/>
	countyid：<input type="text" name="countyid" value="${form.countyid }"/>
	<span style="color: red; font-weight: 900">${errors.countyid }</span>
	<br/>
	totalwaste：<input type="text" name="totalwaste" value="${form.totalwaste }"/>
	<span style="color: red; font-weight: 900">${errors.totalwaste }</span>
	<br/>
	dayofsample：<input type="text" name="dayofsample" value="${form.dayofsample }"/>
	<span style="color: red; font-weight: 900">${errors.dayofsample }</span>
	<br/>
	organic	：<input type="text" name="organic" value="${form.organic }"/>
	<span style="color: red; font-weight: 900">${errors.organic }</span>
	<br/>
	plastic	：<input type="text" name="plastic" value="${form.plastic }"/>
	<span style="color: red; font-weight: 900">${errors.plastic }</span>
	<br/>
	metal	：<input type="text" name="metal" value="${form.metal }"/>
	<span style="color: red; font-weight: 900">${errors.metal }</span>
	<br/>
	glass	：<input type="text" name="glass" value="${form.glass }"/>
	<span style="color: red; font-weight: 900">${errors.glass }</span>
	<br/>
	paper	：<input type="text" name="paper" value="${form.paper }"/>
	<span style="color: red; font-weight: 900">${errors.paper }</span>
	<br/>
	<input type="submit" value="Update Waste"/>
</form>

</body>
</html>
