<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 목록</title>
</head>
<body>
	<h2> * 직원 목록 *</h2>
	<table border="1">
		<tr><td>사번</td><td>이름</td><td>부서명</td><td>직급</td><td>입사년도</td></tr>
		<c:forEach var="j" items="${datas }">
			<tr>
				<td>${j.jikwon_no }</td>
				<td>${j.jikwon_name }</td>
				<td>${j.buser_name }</td>
				<td>${j.jikwon_jik }</td>
				<td>${j.jikwon_ibsail }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5">인원 : ${j.jikwon_no }</td>
		</tr>
		<tr>
			<td colspan="5">
				<form action="search" method="post">
					부서별 자료보기 : 
					<select>
						<option value="selected">전체</option>
						<option value="총무부">총무부</option>
						<option value="영업부">영업부</option>
						<option value="전산부">전산부</option>
						<option value="관리부">관리부</option>
					</select>
					<input type="submit" value="검색">
				</form>
		</tr>
	</table>
</body>
</html>