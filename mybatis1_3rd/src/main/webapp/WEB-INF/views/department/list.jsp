<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="/common.css" />
    <style media="screen">
      a.btn {
        float: right;
        margin: -20px 0 5px 0;
      }
      td:nth-child(1) {
        text-align: center;
      }
    </style>
    <title></title>
  </head>
  <body>
    <div class="container">
      <h1>학과목록</h1>
      <a href="create" class="btn">학과등록</a>
      <table class="list">
        <thead>
          <tr>
            <th>id</th>
            <th>학과명</th>
            <th>단축 학과명</th>
            <th>전화</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="department" items="${ departments }">
            <tr>
              <td>${ department.id }</td>
              <td><a href="edit?id=${ department.id }">${ department.name }</a></td>
              <td>${ department.shortName }</td>
              <td>${ department.phone }</td>
              <td><a href="delete?id=${ department.id }">삭제</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
  </body>
</html>