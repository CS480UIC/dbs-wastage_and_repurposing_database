<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update County</title>
    
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
  <h1>Update County</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	county    :<input type="text" name="countyid" value="${County.countyid }" disabled/>
	<br/>
	stateid：<input type="text" name="stateid" value="${County.stateid }" disabled/>
	<br/>
	countyname	：<input type="text" name="countyname" value="${County.countyname }" disabled/>
	<br/>
	population	：<input type="text" name="population" value="${County.population }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/CountyServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="countyid" value="${County.countyid }"/>
	stateid	：<input type="text" name="stateid" value="${form.stateid }"/>
	<span style="color: red; font-weight: 900">${errors.stateid }</span>
	<br/>
	countyname	：<input type="text" name="countyname" value="${form.countyname }"/>
	<span style="color: red; font-weight: 900">${errors.countyname }</span>
	<br/>
	population	：<input type="text" name="population" value="${form.population }"/>
	<span style="color: red; font-weight: 900">${errors.population }</span>
	<br/>
	<input type="submit" value="Update County"/>
</form>

</body>
</html>
