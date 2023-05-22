<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style>
    div.container { width: 600px; margin: 50px auto; }
    body { font-family: 굴림체; }
    table { width: 500px;  border-collapse: collapse; }
    table td:nth-child(1) { background-color: #eee; }
    td { padding: 5px; border: 1px solid lightgray; }   
  </style>
</head>
<body>

<div class="container">

<h1>과목</h1>

<table>
  <tr>
    <td>ID</td>
    <td>${ course.id }</td>
  </tr>
  <tr>
    <td>년도</td>
    <td>${ course.year }</td>
  </tr>  <tr>
    <td>학기</td>
    <td>${ course.semester }</td>
  </tr>
  <tr>
    <td>구분</td>
    <td>${ course.gubun }</td>
  </tr>
  <tr>
    <td>코드</td>
    <td>${ course.code }</td>
  </tr>
  <tr>
    <td>과목명</td>
    <td>${ course.title }</td>
  </tr>
  <tr>
    <td>담당교수</td>
    <td>${ course.professorName }</td>
  </tr>
  <tr>
    <td>시간</td>
    <td>${ course.sigan }</td>
  </tr>
</table>

<a href="javascript:window.history.back()">돌아가기</a>
</div>
</body>
</html>

