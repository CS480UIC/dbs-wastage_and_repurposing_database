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
<h1>Update the values below</h1>
<form action="<c:url value='/WasteServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="Totalwaste" value="${Waste.username }"/>
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
	<input type="submit" value="Update Waste"/>
</form>

</body>
</html>
