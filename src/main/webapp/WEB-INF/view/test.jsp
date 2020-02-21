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
	<h1 style="color: red">${info }</h1>
	<form action="/springmvc1/loginin" method="post">
		<p>
			<label>昵称：</label>
			<input type="text" name="name"/>
		</p>
		<p>
			<label>所在城市：</label>
			<input type="text" name="city"/>
		</p>
		<p>
			<label>您所使用的开发语言：</label>
			<input type="checkbox" name="language" value="Java"/>Java
			<input type="checkbox" name="language" value="C"/>C
			<input type="checkbox" name="language" value="C++"/>C++
			<input type="checkbox" name="language" value="PHP"/>PHP
			<input type="checkbox" name="language" value="ASP"/>ASP
		</p>
		<p>
			<label></label>
			<input type="submit" value="提交"/>
		</p>
	</form>
</body>
</html>