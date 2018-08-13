<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="entity.*,dao.*,java.util.*,web.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>图书信息修改</title>
</head>
<body>
	<center>
		<h2>修改图书信息</h2>


		<form action="UpdateServlet" method="post">
			<%
				int id = Integer.parseInt(request.getParameter("id"));
			%>
			<h4>
				图书编号：<input type="text" name="id" value="<%=id%>" readonly="readonly"></input>
			</h4>
			<h4>
				图书名称：<input type="text" name="name"> </input>
			</h4>
			<h4>
				图书作者：<input type="text" name="author"></input>
			</h4>
			<h4>
				图书类别：<input type="text" name="category"></input>
			</h4>
			<input type="submit" value="提交" />
		</form>
		
		  <a href="index.jsp">返回主页面</a><br/><br/>
	</center>

</body>
</html>