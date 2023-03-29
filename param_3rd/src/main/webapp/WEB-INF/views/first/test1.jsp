<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <style media="screen">
      table {
        border-collapse: collapse;
      }
      td {
        width: 100px;
        padding: 5px;
        border: 1px solid gray;
        background-color: lightgray;
      }
      td:nth-child(2) {
      	width: 500px;
      	background-color: white;
      }
    </style>
    <title></title>
  </head>
  <body>
    <table>
      <tr>
        <td>id</td>
        <td>${ id }</td>
      </tr>
      <tr>
        <td>name</td>
        <td>${ name }</td>
      </tr>
      <tr>
        <td>시각</td>
        <td><fmt:formatDate pattern="HH:mm:ss" value="${ now }" /></td>
      </tr>
    </table>
  </body>
</html>
