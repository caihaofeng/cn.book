package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import entity.Book;

/**
 * Servlet implementation class UpsetServlet
 */
@WebServlet("/UpsetServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String category = req.getParameter("category");

		try {
			Book book = new Book();
			book.setId(Integer.parseInt(id));
			book.setName(name);
			book.setAuthor(author);
			book.setCategory(category);
			BookDAO dao = new BookDAO();
			dao.updateBook(book);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException("001");
		}
		req.getRequestDispatcher("all.jsp").forward(req, resp);
	}
}
