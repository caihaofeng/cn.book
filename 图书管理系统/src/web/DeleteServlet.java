package web;



import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
 

 
public class DeleteServlet extends HttpServlet { // É¾³ýÊý¾Ý
 
	public void service(HttpServletRequest req,HttpServletResponse resp)throws
    ServletException,IOException{

        resp.setContentType("text/html;charset=utf-8");
        String idStr = req.getParameter("id");
        int id = Integer.valueOf(idStr);
         BookDAO dao=new BookDAO();
         dao.deleteBook(id);
         req.getRequestDispatcher("AllServlet").forward(req, resp);
        
		
	}
 
}
