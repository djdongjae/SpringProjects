<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style>
    div.container { width: 900px; margin: 50px auto; }
    thead th { background-color: #eee; }
    table{ border-collapse: collapse; width: 100%; }
    td, th { padding: 4px; border: 1px solid lightgray; }
    td:nth-child(4) { text-align: center; }
  </style>
</head>
<body>
<div class="container">
  <h1>과목 목록</h1>
  
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
        <tr>
          <td>${ course.id }</td>
          <td>${ course.year }</td>
          <td>${ course.semester }</td>
          <td>${ course.gubun }</td>
          <td>${ course.code }</td>
          <td>${ course.title }</td>
          <td>${ course.professorName }</td>
          <td>${ course.sigan }</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>

