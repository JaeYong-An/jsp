<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상세보기</h1>
<table border = "1">
<tr><th>글번호</th><td>${bvo.bno }</td></tr>
<tr><th>제목</th><td>${bvo.title }</td></tr>
<tr><th>글쓴이</th><td>${bvo.writer }</td></tr>
<tr><th>조회수</th><td>${bvo.readCnt }</td></tr>
<tr><th>등록날짜</th><td>${bvo.regdate }</td></tr>
<tr><th>수정날짜</th><td>${bvo.moddate }</td></tr>
<tr><th>내용</th><td>${bvo.content }</td></tr>
</table>
<a href="/brd/modify?bno=${bvo.bno }"><button>수정</button></a>
<a href="/brd/remove?bno=${bvo.bno }"><button>삭제</button></a>
<a href="/brd/list"><button>목록으로</button></a>
</body>
</html>