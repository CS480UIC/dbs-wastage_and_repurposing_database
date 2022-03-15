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
  <h1>Update State</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	ID    :<input type="text" name="id1" value="${state.id }" disabled/>
	<br/>
	StateName    ：<input type="text" name="statename1" value="${state.statename }" disabled />
	<br/>
	NumberOfCounties    ：<input type="text" name="numberofcounties1" value="${state.numberofcounties }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/Entity1ServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="id" value="${state.id }"/>
	StateName    ：<input type="password" name="statename" value="${form.statename }"/>
	<span style="color: red; font-weight: 900">${errors.statename }</span>
	<br/>
	NumberOfCounties    ：<input type="text" name="numberofcounties" value="${form.numberofcounties }"/>
	<span style="color: red; font-weight: 900">${errors.numberofcounties }</span>
	<br/>
	<input type="submit" value="Update State"/>
</form>

</body>
</html>