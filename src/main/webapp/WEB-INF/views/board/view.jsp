<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="old.*" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>읽기 ${dto.getSubject() }</title>
</head>
<script>
function chkDelete(id){
	// 삭제 여부 확인
	var r = confirm("삭제하시겠습니까?");
	
	if(r){
		location.href = 'deleteOk.do?uid=' + ${dto.getUid()};
	}
	
}
</script>
<body>
<c:choose>
	<c:when test="${empty dto || fn.length(dto)}">
		<script>
			alert("해당 글이 삭제되거나 없습니다");
			history.back();
		</script>
	</c:when>
	<c:otherwise>
	

<h2>읽기 ${dto.getSubject() }</h2>
<br>
id : ${dto.getUid() }<br>
작성자 : ${dto.getName() }<br>
제목: ${dto.getSubject() }<br>
등록일: ${dto.getRegDate() }<br>
조회수: ${dto.getViewCnt() }<br>
내용: <br>
<hr>
<div>
${dto.getContent() }
</div>
<hr>
<br>
<button onclick="location.href = 'update.do?uid=${dto.getUid() }'">수정하기</button>
<button onclick="location.href = 'list.do'">목록보기</button>
<button onclick="chkDelete(${dto.getUid() })">삭제하기</button>
<button onclick="location.href = 'write.do'">신규등록</button>


	</c:otherwise>
</c:choose>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>







