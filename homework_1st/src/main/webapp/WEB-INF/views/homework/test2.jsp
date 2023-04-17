<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
 div.container { width: 600px; margin: 20px auto; }
 form div { margin-bottom: 10px; }
 input { width: 200px; padding: 4px; }
 button { padding: 0.4em 3em; margin-top: 10px; }
</style>
</head>
<body>
 <div class="container">
 <form method="post">
 <select name="value">
 <option ${ value=="one" ? "selected" : "" }>one</option>
 <option ${ value=="two" ? "selected" : "" }>two</option>
 <option ${ value=="three" ? "selected" : "" }>three</option>
 </select>
 <div>
 ${ value }
 </div>
 <button type="submit">
 OK
 </button>
 </form>
 </div>
</body>
</html>