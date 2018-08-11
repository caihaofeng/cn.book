package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import entity.Book;

public class AllServlet extends HttpServlet {
	private static final long serialVersionUID =1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		this.doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		BookDAO dao =new BookDAO();
		List<Book> list = dao.getAllBook();
		req.setAttribute("list", list);
		req.getRequestDispatcher("all.jsp").forward(req, resp);
	}
}
