<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="old.*" %>


<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>수정 ${dto.getSubject()}</title>
</head>
<script>
// form 검증
function chkSubmit(){
	frm = document.forms["frm"];
	
	var subject = frm["subject"].value.trim();
	
	if(subject == ""){
		alert("제목은 반드시 작성해야 합니다");
		frm["subject"].focus();
		return false;
	}
	
	return true;
}
</script>
<body>
<h2>수정</h2>
<%--내용 과 제목만 수정 가능. submit 하기전에 검증 --%>
<form name="frm" action="updateOk.do" 
	method="post" onsubmit="return chkSubmit()">
<input type="hidden" name="uid" value="${dto.getUid()}"/>	
작성자 : ${dto.getName()}<br>  <%-- 작성자 이름은 변경 불가 --%>
제목 : 
<input type="text" name="subject" value="${dto.getSubject()}"><br>
내용 :
<textarea name="content">${dto.getContent()}</textarea>
<br><br>
<input type="submit" value="수정"/>
</form>

<button onclick="history.back()">이전으로</button>
<button onclick="location.href = 'list.do'">목록보기</button>

</body>
</html>
















