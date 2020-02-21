<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<p>您填写的内容是：</p>
	<p>昵称：<span>${name }</span></p>
	<p>所在城市：<span>${city }</span></p>
	<p>使用的开发语言有：
		<c:forEach items="${language }" var="temp">
			${temp }、
		</c:forEach>
	</p>
</body>
</html>