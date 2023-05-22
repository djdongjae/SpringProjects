<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 900px;
	margin: 50px auto;
}

thead th {
	background-color: #eee;
}

table {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	padding: 4px;
	border: 1px solid lightgray;
}

td:nth-child(4) {
	text-align: center;
}

input {
	padding: 5px;
	font-size: 10pt;
}

button {
	margin: 10px;
	padding: 0.4em 2em;
}

tr[data-url]:hover {
	background-color: #ffb;
	cursor: pointer;
}
td a {
  text-decoration: none;
  color: black;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>과목 목록</h1>
		<form>
			<label>과목명</label> <input type="text" name="srchText"
				value="${ srchText }" placeholder="검색조건" />
			<button type="submit">조회</button>
		</form>

		<table class="table table-bordered table-condensed">
			<thead>
				<tr>
					<th>ID</th>
					<th>년도</th>
					<th>학기</th>
					<th>구분</th>
					<th>코드</th>
					<th>과목명</th>
					<th>담당교수</th>
					<th>시간</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="course" items="${ courses }">
					<tr data-url="detail?id=${ course.id }">
						<td>${ course.id }</td>
						<td>${ course.year }</td>
						<td>${ course.semester }</td>
						<td>${ course.gubun }</td>
						<td>${ course.code }</td>
						<td><a href="detail?id=${ course.id }">${ course.title }</a></td>
						<td>${ course.professorName }</td>
						<td>${ course.sigan }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	<script>
		$("[data-url]").click(function() {
			var url = $(this).attr("data-url");
			location.href = url;
		})
	</script>
</body>
</html>

