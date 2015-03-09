<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- <title>dbInfo.jsp</title> -->
<!-- </head> -->
<!-- <body> -->
	<%
		// 		request.setCharacterEncoding("utf-8");
	%>
	<h1>${param.name}</h1>

	<br>
	<div>className = ${applicationScope.className}</div>
	<br>
	<div>url = ${applicationScope.url}</div>
	<br>
	<div>user = ${applicationScope.user}</div>
	<br>
	<div>password = ${applicationScope.password}</div>
<!-- </body> -->
<!-- </html> -->