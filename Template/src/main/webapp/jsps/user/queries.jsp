<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1>List of Queries</h1>
    <br>
    <a href="<c:url value='/findAll'/>" target="body">Please list all the user in the table<br></a>&nbsp;&nbsp;
 	<a href="<c:url value='/findIDandTotal'/>" target="body">Please list the countyid and totalwaste of waste<br></a>&nbsp;&nbsp;
 	<a href="<c:url value='/findAddresses'/>" target="body">Please list the facilityid and address of wastefacility<br></a>&nbsp;&nbsp;
 	
 	<a href="<c:url value='/findIDandSumTotal'/>" target="body">Please list the countyid and sum of their totalwaste of waste<br></a>&nbsp;&nbsp;
 	<a href="<c:url value='/findLowPop'/>" target="body">Please list the countyname and stateid of county with below average population<br></a>&nbsp;&nbsp;
 	
 	<a href="<c:url value='/findNameandTotal'/>" target="body">Please list the countyname and totalwaste of county<br></a>&nbsp;&nbsp;
    <a href="<c:url value='/findCountywithFacility'/>" target="body">Please list the countynames that have facilities from county<br></a>&nbsp;&nbsp;
  </body>
</html>
