<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<h1>Register Page</h1>
<form action="/brd/insert" method="post">
	제목 : <input type="text" name="title"><br>
	글쓴이 : <input type="text" name="writer"><br>
	내용 : <textarea rows="20" cols="20" name="content"></textarea><br>
	<button type="submit">등록</button>
</form>
	<a href="/brd/list"><button type="button">취소</button></a>
</body>
</html>