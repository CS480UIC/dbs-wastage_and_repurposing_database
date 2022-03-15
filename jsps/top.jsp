<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>top</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {
		background: #4682B4; 
	}
	a {
		text-transform:none;
		text-decoration:none;
	} 
	a:hover {
		text-decoration:underline;
	}
</style>
  </head>
  
  <body>
<h1 style="text-align: center;">wastage_and_repurposing_database</h1>
<div style="font-size: 10pt;">
	<c:choose>
		<c:when test="${empty sessionScope.session_user }">
			<a href="<c:url value='/jsps/user/login.jsp'/>" target="_parent">Login</a> |&nbsp; 
			<a href="<c:url value='/jsps/user/regist.jsp'/>" target="_parent">Register</a> |&nbsp; 
	
		</c:when>
		<c:otherwise>
			Hello：${sessionScope.session_user.username };
			<a href="<c:url value='/jsps/item.jsp'/>" target="body">Query Result</a> |&nbsp;&nbsp;
			<a href="<c:url value='/UserServletLogout'/>" target="_parent">Logout</a> |&nbsp; 
			
			<a href="<c:url value='/jsps/state/menu.jsp'/>" target="body">CRUD State</a> |&nbsp;
			<a href="<c:url value='/jsps/state/menu.jsp'/>" target="body">CRUD County</a> |&nbsp;
			<a href="<c:url value='/jsps/wastefacility/menu.jsp'/>" target="body">CRUD WasteFacility</a> |&nbsp;
			<a href="<c:url value='/jsps/state/menu.jsp'/>" target="body">CRUD Waste</a> |&nbsp;
			<a href="<c:url value='/jsps/wastemanagement/menu.jsp'/>" target="body">CRUD WasteMangement</a> |&nbsp;
			
			
			<!-- <a href="<c:url value='/jsps/state/statecreate.jsp'/>" target="_parent">Create State</a> |&nbsp; 
			<a href="<c:url value='/jsps/state/stateread.jsp'/>" target="_parent">Read State</a> |&nbsp;
			<a href="<c:url value='/jsps/state/stateupdate.jsp'/>" target="_parent">Update State</a> |&nbsp;
			<a href="<c:url value='/jsps/state/statedelete.jsp'/>" target="_parent">Delete State</a> |&nbsp;
			
			
			<a href="<c:url value='/jsps/entity1/entity1create.jsp'/>" target="_parent">Create County</a> |&nbsp; 
			<a href="<c:url value='/jsps/entity1/entity1read.jsp'/>" target="_parent">Read County</a> |&nbsp;
			<a href="<c:url value='/jsps/entity1/entity1update.jsp'/>" target="_parent">Update County</a> |&nbsp;
			<a href="<c:url value='/jsps/entity1/entity1delete.jsp'/>" target="_parent">Delete County</a> |&nbsp;
			
			
			<a href="<c:url value='/jsps/wastefacility/wastefacilitycreate.jsp'/>" target="_parent">Create WasteFacility</a> |&nbsp; 
			<a href="<c:url value='/jsps/wastefacility/wastefacilityread.jsp'/>" target="_parent">Read WasteFacility</a> |&nbsp;
			<a href="<c:url value='/jsps/wastefacility/wastefacilityupdate.jsp'/>" target="_parent">Update WasteFacility</a> |&nbsp;
			<a href="<c:url value='/jsps/wastefacility/wastefacilitydelete.jsp'/>" target="_parent">Delete WasteFacility</a> |&nbsp;
			
			
			<a href="<c:url value='/jsps/entity1/entity1create.jsp'/>" target="_parent">Create Waste</a> |&nbsp; 
			<a href="<c:url value='/jsps/entity1/entity1read.jsp'/>" target="_parent">Read Waste</a> |&nbsp;
			<a href="<c:url value='/jsps/entity1/entity1update.jsp'/>" target="_parent">Update Waste</a> |&nbsp;	
			<a href="<c:url value='/jsps/entity1/entity1delete.jsp'/>" target="_parent">Delete Waste</a> |&nbsp;
			
			<a href="<c:url value='/jsps/wastemanagement/wastemanagementcreate.jsp'/>" target="_parent">Create WasteMangement</a> |&nbsp; 
			<a href="<c:url value='/jsps/wastemanagement/wastemanagementread.jsp'/>" target="_parent">Read WasteMangement</a> |&nbsp;			
			<a href="<c:url value='/jsps/wastemanagement/wastemanagementupdate.jsp'/>" target="_parent">Update WasteMangement</a> |&nbsp;
			<a href="<c:url value='/jsps/wastemanagement/wastemanagementdelete.jsp'/>" target="_parent">Delete WasteMangement</a> |&nbsp; -->

		</c:otherwise>
	</c:choose>

</div>
  </body>
</html>

