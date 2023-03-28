<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" type="text/css" href="/common.css" />
    <title></title>
    <style>
      form {
        width: 600px;
        margin: auto;
        box-shadow: 0 0 4px lightgray, 2px 2px 4px gray;
        overflow: auto;
      }
      div.title {
        font-size: 20pt;
        padding: 10px;
        background-color: #eee;
      }
      table {
        margin: 20px;
      }
      td {
        min-width: 100;
        padding: 5px;
      }
      td:nth-child(1) {
        text-align: right;
      }
      button {
        margin: 5px 0 20px 20px;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <form method="post">
        <div class="title">학생 정보</div>
        <table>
          <tr>
            <td>id</td>
            <td><input type="text" value="${ student.id }" readonly disabled /></td>
          </tr>
          <tr>
            <td>학번</td>
            <td><input type="text" name="studentNo" value="${ student.studentNo }"/></td>
          </tr>
          <tr>
            <td>이름</td>
            <td><input type="text" name="name" value="${ student.name }"/></td>
          </tr>
          <tr>
            <td>학과번호</td>
            <td><input type="text" name="departmentId" value="${ student.departmentId }"/></td>
          </tr>
          <tr>
            <td>전화</td>
            <td><input type="text" name="phone" value="${ student.phone }"/></td>
          </tr>
          <tr>
            <td>성별</td>
            <td><input type="text" name="sex" value="${ student.sex }"/></td>
          </tr>
          <tr>
            <td>이메일</td>
            <td><input type="text" name="email" value="${ student.email }"/></td>
          </tr>
        </table>
        <button type="submit" class="btn">저장</button>
        <c:if test="${ student.id > 0 }">
          <a href="delete?id=${ student.id }" class="btn">삭제</a>
        </c:if>
      </form>
    </div>
  </body>
</html>
