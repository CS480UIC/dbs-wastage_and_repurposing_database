<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create WasteFacility</title>
    
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
  <h1>Create WasteFacility</h1>
<form action="<c:url value='/WasteFacilityServletCreate'/>" method="post">
	ID    :<input type="text" name="facilityid" value="${form.facilityid }"/>
	<span style="color: red; font-weight: 900">${errors.facilityid }</span>
	<br/>
	CountyID    ：<input type="text" name="countyid" value="${form.countyid }"/>
	<span style="color: red; font-weight: 900">${errors.countyid }</span>
	<br/>
	Address    ：<input type="text" name="address" value="${form.address }"/>
	<span style="color: red; font-weight: 900">${errors.address }</span>
	<br/>
	RecycleOrDump    ：<input type="text" name="recycleordump" value="${form.recycleordump }"/>
	<span style="color: red; font-weight: 900">${errors.recycleordump }</span>
	<br/>
	
	<input type="submit" value="Create WasteFacility"/>
</form>
  </body>
</html>
