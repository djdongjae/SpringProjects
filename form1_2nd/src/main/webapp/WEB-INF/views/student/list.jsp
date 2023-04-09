<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" type="text/css" href="/common.css" />
    <title></title>
    <style media="screen">
      a.btn {
        float: right;
        margin: -20px 0 5px 0;
      }
      td:nth-child(1) {
        text-align: center;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>학생 목록</h1>
      <a href="create" class="btn">학생 등록</a>
      <table class=list>
        <thead>
          <tr>
            <th>id</th>
            <th>학번</th>
            <th>이름</th>
            <th>학과 id</th>
            <th>전화</th>
            <th>성별</th>
            <th>이메일</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="student" items="${ students }">
            <tr>
              <td>${ student.id }</td>
              <td>${ student.studentNo }</td>
              <td><a href="edit?id=${ student.id }">${ student.name }</a></td>
              <td>${ student.departmentId }</td>
              <td>${ student.phone }</td>
              <td>${ student.sex }</td>
              <td>${ student.email }</td>
              <td><a href="delete?id=${ student.id }">삭제</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </body>
</html>
