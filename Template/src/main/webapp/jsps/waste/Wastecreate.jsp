<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Waste Create</title>
    
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
  <h1>waste Create</h1>
<form action="<c:url value='/WasteServletCreate'/>" method="post">
	id         ：<input type="text" name="id" value="${form.id }"/>
	<span style="color: red; font-weight: 900">${errors.totalwaste }</span>
	<br/>
	totalwaste：<input type="text" name="totalwaste" value="${form.totalwaste }"/>
	<span style="color: red; font-weight: 900">${errors.totalwaste }</span>
	<br/>
	countyID	：<input type="text" name="Countyid" value="${form.countyID }"/>
	<span style="color: red; font-weight: 900">${errors.countyID }</span>
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
	<input type="submit" value="Waste Create"/>
</form>
  </body>
</html>
