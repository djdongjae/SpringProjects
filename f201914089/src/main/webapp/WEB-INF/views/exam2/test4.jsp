<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        table, tr, td{
            border: 1px solid gray;
            border-collapse: collapse;
            padding: 5px;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <td>학번</td>
            <td>${ param1 }</td>
        </tr>
        <tr>
            <td>이름</td>
            <td>${ param2 }</td>
        </tr>
    </table>
</body>
</html>