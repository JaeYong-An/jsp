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
<h1>글 목록</h1>
<table border="1">
	<tr>
		<th>bno</th>
		<th>title</th>
		<th>writer</th>
		<th>regdate</th>
		<th>readCount</th>
	</tr>
	<c:forEach items="${list }" var="bvo">
		<tr>
			<td>${bvo.bno }</td>
			<td><a href="/brd/detail?bno=${bvo.bno }">${bvo.title }</a></td>
			<td>${bvo.writer }</td>
			<td>${bvo.regdate }</td>
			<td>${bvo.readCnt }</td>
		</tr>
	</c:forEach>
	</table>
	<a href="/brd/register"><button>글쓰기</button></a>
	<a href="/index.jsp"><button type="button">인덱스로</button></a>
</body>
</html>