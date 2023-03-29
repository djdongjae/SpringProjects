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
        <div class="title">버스 등록</div>
        <table>
          <tr>
            <td>버스번호</td>
            <td><input type="text" name="busNo" value="${ bus.busNo }"/></td>
          </tr>
          <tr>
            <td>기점</td>
            <td><input type="text" name="firstStop" value="${ bus.firstStop }"/></td>
          </tr>
          <tr>
            <td>종점</td>
            <td><input type="text" name="lastStop" value="${ bus.lastStop }"/></td>
          </tr>
          <tr>
            <td>학과</td>
            <td>
            	<select name="categoryId">
            		<option value="1" ${ bus.categoryId == 1 ? "selected" : "" }>지선</option>
            		<option value="2" ${ bus.categoryId == 2 ? "selected" : "" }>일반</option>
            		<option value="3" ${ bus.categoryId == 3 ? "selected" : "" }>간선</option>
            		<option value="4" ${ bus.categoryId == 4 ? "selected" : "" }>직행</option>
            	</select>
            </td>
          </tr>
          <tr>
            <td>첫차</td>
            <td><input type="text" name="firstBus" value="${ bus.firstBus }"/></td>
          </tr>
          <tr>
            <td>막차</td>
            <td><input type="text" name="lastBus" value="${ bus.lastBus }"/></td>
          </tr>
        </table>
        <button type="submit" class="btn">저장</button>
        <a href="list" class="btn">목록으로</a>
      </form>
    </div>
  </body>
</html>
