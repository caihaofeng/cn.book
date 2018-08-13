<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加图书信息</title>
</head>
<body>
  <center>
  <h2>添加图书信息</h2><hr>

 <form action="AddServlet" method="post"  >

<h4>  图书编号：<input type="text" name="id" class="{required:true}"></input><br></h4>

<h4>  图书名称：<input type="text" name="name"></input><br></h4>

<h4>  图书作者：<input type="text" name="author"></input><br></h4>
<h4> 图书类别：<input type="text" name="category"></input><br></h4>




 <input type="submit" value="提交"/>

  </form>

  <a href="all.jsp">查询所图书信息</a><br/><br/>
    <a href="index.jsp">返回主页面</a><br/><br/>
  </center>
</body>
</html>