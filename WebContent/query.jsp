<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
       <%@ page import="entity.*,dao.*,java.util.*,web.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>图书信息查询</title>
</head>
<body>
<center>


<h2>图书信息查询 </h2>
 <form action="SelectServlet" method="post"  >



<h4>  图书名称：<input type="text" name="name" > </input>
<input type="submit" value="查询" /><br/><br/></h4>


  <a href="index.jsp">返回主页面</a><br/><br/>
</form>
</center>
</body>
</html>