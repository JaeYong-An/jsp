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
	<h1>hello my 1st JSP world~!!</h1>
	
	<div>
		<c:if test="${ses.id ne null }">
			${ses.id }님이 로그인 하셨습니다. <br>
			계정생성일 : ${ses.regdate }<br>
			마지막 로그인 : ${ses.lastlogin }<br>
			<a href="/brd/register"><button>글쓰기</button></a>
			<a href="/memb/list"><button>회원리스트</button></a>
			<a href="/memb/detail"><button>내 정보</button></a>
			<a href="/memb/logout"><button>로그아웃</button></a>
		</c:if>
	</div>
	<div>
		<c:if test="${ses.id eq null }">
			<form action="/memb/login">
				아이디 : <input type="text" name="id"><br>
				비밀번호 : <input type="password" name="pwd"><br>
				<button type="submit">로그인</button>	
			</form>
				<a href="/memb/join"><button>회원가입</button></a>
		</c:if>
	</div>
	<a href="/brd/list"><button>게시글 리스트</button></a>
</body>
</html>