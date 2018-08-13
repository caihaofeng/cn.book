<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="entity.*,dao.*,java.util.*,web.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>全部图书信息</title>
</head>
<body>
 <center>
  <br>

    <h2>图书信息</h2>  <hr>    

    <br>

  <h3>全部图书信息如下</h3>

   <table width="720" border="100" cellSpacing=3 style="font-size:15pt;border:dashed 1pt; 
   background-color:	#87CEFA">

    <tr>

    <td>图书编号</td>

    <td>图书名称</td>

    <td>图书作者</td>

    <td>图书类别</td>
<td>操作</td>
    </tr>
    
    
    <%
							BookDAO dao = new BookDAO(); 
							List<Book> books = dao.getAllBook();
							for(int i = 0;i<books.size();i++){
								Book book = books.get(i);		
								%>
    
    <tr>
    <td><%=book.getId() %></td>
    <td><%=book.getName()%></td>
    <td><%=book.getAuthor()%></td>
    <td><%=book.getCategory()%></td>
    
    <td><a href="DeleteServlet?id=<%=book.getId() %>">删除</a>|<a href="update.jsp?id=<%=book.getId() %>">修改</a></td>
    </tr>
    			<%
							}
								%>

								</table>
									<br>
		  <a href="add.jsp">增加图书信息</a><br/><br/>
		  <a href="index.jsp">返回主页面</a><br/><br/>	    
    </center>
</body>
</html>