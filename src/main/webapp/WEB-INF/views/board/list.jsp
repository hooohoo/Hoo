<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="old.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>글 목록</title>
<style>
table {
	width: 100%;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>

<c:choose>
	<c:when test="${empty list || fn.length(list) == 0 }">
		멤버가 없습니다.
	</c:when>
	<c:otherwise>




	<hr>
	<h2>리스트</h2>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>내용</th>
			<th>조회수</th>
			<th>등록일</th>
		</tr>
		
		<c:forEach var="dto" items="${list }">
			<tr>
			<td>${dto.uid }</td>
			<td><a href="view.do?uid=${dto.uid }">${dto.subject }</a></td>
			<td>${dto.name }</td>
			<td>${dto.content }</td>
			<td>${dto.viewCnt }</td>
			<td>${dto.regDate }</td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<button onclick="location.href = 'write.do'">신규등록</button>
	
	</c:otherwise>
</c:choose>
</body>
</html>








