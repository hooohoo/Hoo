<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- DAO bean 생성 -->


<%-- 위에서 필요한 트랜잭션이 마무리 되면 페이지에 보여주기 --%>

	<c:if test="${result == 0 }">
		<script>
			alert("등록실패!");
			history.back();
		</script>
	</c:if>
	<c:if test="${result > 0 }">
		<script>
			alert("등록성공, 리스트를 출력합니다");
			location.href = "list.do";
		</script>
	</c:if>












