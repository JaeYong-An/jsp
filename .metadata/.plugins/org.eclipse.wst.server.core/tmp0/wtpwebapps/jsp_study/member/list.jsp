<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 목록</h1>
<table border="1">
	<tr>
		<th>id</th>
		<th>pwd</th>
		<th>email</th>
		<th>age</th>
		<th>regdate</th>
		<th>lastlogin</th>
	</tr>
	<c:forEach items="${list }" var="mvo">
		<tr>
			<td>${mvo.id }</td>
			<td>${mvo.pwd }</td>
			<td>${mvo.email }</td>
			<td>${mvo.age }</td>
			<td>${mvo.regdate }</td>
			<td>${mvo.lastlogin }</td>
		</tr>
	</c:forEach>
	</table>
	<a href="/index.jsp"><button type="button">인덱스로</button></a>
</body>
</html>