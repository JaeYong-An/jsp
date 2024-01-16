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
<tr><th>id</th><td>${mvo.id }</td></tr>
<tr><th>pwd</th><td>${mvo.pwd }</td></tr>
<tr><th>email</th><td>${mvo.email }</td></tr>
<tr><th>age</th><td>${mvo.age }</td></tr>
<tr><th>regdate</th><td>${mvo.regdate }</td></tr>
<tr><th>lastlogin</th><td>${mvo.lastlogin }</td></tr>
</table>
<a href="/memb/modify?id=${bvo.bno }"><button>수정</button></a>
<a href="/memb/remove?bno=${bvo.bno }"><button>탈퇴</button></a>
<a href="/index.jsp"><button>인덱스로</button></a>
</body>
</html>