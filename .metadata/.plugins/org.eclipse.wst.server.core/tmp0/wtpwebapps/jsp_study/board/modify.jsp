<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수정하기</h1>
<form action="/brd/edit">
<table border = "1">
<tr><th>글번호</th><td><input type="text" name="bno" value="${bvo.bno }" readonly="readonly"></td></tr>
<tr><th>제목</th><td><input type="text" name="title" value="${bvo.title }"></td></tr>
<tr><th>글쓴이</th><td>${bvo.writer }</td></tr>
<tr><th>등록날짜</th><td>${bvo.regdate }</td></tr>
<tr><th>수정날짜</th><td>${bvo.moddate }</td></tr>
<tr><th>내용</th><td><input type="text" name="content" value="${bvo.content }"></td></tr>
</table>
<button type="submit">완료</button>
</form>
<a href="/brd/list"><button>목록으로</button></a>

</body>
</html>