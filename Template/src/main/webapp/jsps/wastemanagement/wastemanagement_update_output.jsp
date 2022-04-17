<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Entity</title>
    
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
  <h1>Update WasteManagement</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	ID：<input type="text" name="managementid1" value="${wastemanagement.managementid }" disabled/>
	<br/>
	FacilityID：<input type="text" name="facilityid1" value="${wastemanagement.facilityid }" disabled/>
	<br/>
	TotalWaste    :<input type="text" name="totalwaste1" value="${wastemanagement.totalwaste }" disabled/>
	<br/>
	Day Of Sample    :<input type="text" name="dayofsample" value="${wastemanagement.dayofsample }" disabled/>
	<br/>
	Organic	：<input type="text" name="organic1" value="${wastemanagement.organic }" disabled/>
	<br/>
	Plastic	：<input type="text" name="plastic1" value="${wastemanagement.plastic }" disabled/>
	<br/>
	Metal	：<input type="text" name="metal1" value="${wastemanagement.metal }" disabled/>
	<br/>
	Glass	：<input type="text" name="glass1" value="${wastemanagement.glass }" disabled/>
	<br/>
	Paper	：<input type="text" name="paper1" value="${wastemanagement.paper }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/WasteManagementServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="managementid" value="${wastemanagement.managementid }"/>
	ID：<input type="text" name="managementid" value="${form.managementid }"/>
	<span style="color: red; font-weight: 900">${errors.managementid }</span>
	<br/>
	FacilityID：<input type="text" name="facilityid" value="${form.facilityid }"/>
	<span style="color: red; font-weight: 900">${errors.facilityid }</span>
	<br/>
	TotalWaste：<input type="text" name="totalwaste" value="${form.totalwaste }"/>
	<span style="color: red; font-weight: 900">${errors.TotalWaste }</span>
	<br/>
	Day Of Sample	：<input type="text" name="dayofsample" value="${form.dayofsample }"/>
	<span style="color: red; font-weight: 900">${errors.dayofsample }</span>
	<br/>
	Organic	：<input type="text" name="organic" value="${form.organic }"/>
	<span style="color: red; font-weight: 900">${errors.organic }</span>
	<br/>
	Plastic	：<input type="text" name="plastic" value="${form.plastic }"/>
	<span style="color: red; font-weight: 900">${errors.plastic }</span>
	<br/>
	Metal	：<input type="text" name="metal" value="${form.metal }"/>
	<span style="color: red; font-weight: 900">${errors.metal }</span>
	<br/>
	Glass	：<input type="text" name="glass" value="${form.glass }"/>
	<span style="color: red; font-weight: 900">${errors.glass }</span>
	<br/>
	Paper	：<input type="text" name="paper" value="${form.paper }"/>
	<span style="color: red; font-weight: 900">${errors.paper }</span>
	<br/>
	<input type="submit" value="Update WasteManagement"/>
</form>

</body>
</html>
