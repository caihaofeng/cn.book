package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.SQLException;
import entity.Book;

public class BookDAO {

	public List<Book> getAllBook(){
		List<Book> list =new ArrayList<Book>();
		Connection conn = DbHelper.getConnection();
		String sql ="select * from book";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rst =pst.executeQuery();
			while(rst.next()) {
				Book book = new Book();
				book.setId(rst.getInt("id"));
				book.setName(rst.getString("name"));
				book.setAuthor(rst.getString("author"));
				book.setCategory(rst.getString("category"));
				list.add(book);
			}
			rst.close(); // 关闭
			pst.close(); // 关闭
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;//test
	}
	
	public boolean addBook(Book book) {
		String sql ="insert into book(id,name,author,category)"+" values(?,?,?,?)";
		Connection conn =DbHelper.getConnection();
		try {
			PreparedStatement pst =conn.prepareStatement(sql);
	     	pst.setInt(1, book.getId());
			pst.setString(2, book.getName());
			pst.setString(3, book.getAuthor());
			pst.setString(4, book.getCategory());
			pst.executeUpdate();	
			pst.close(); // 关闭
		} 
		
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
		
		}
	
	public boolean deleteBook(int id) {
		String  sql ="delete from book where id=?";
		Connection conn = DbHelper.getConnection();?//获取数据库连接
		try {
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			pst.close(); // 关闭
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;	
	}
	
	public boolean updateBook(Book book) {
		String sql ="UPDATE `book` SET `name`=?,`author`=?,`category`=? WHERE `id` = ?"; 
		Connection conn = DbHelper.getConnection();
		try {
			PreparedStatement pst =conn.prepareStatement(sql);
		
			pst.setString(1, book.getName());
			pst.setString(2, book.getAuthor());
			pst.setString(3, book.getCategory());
			pst.setInt(4, book.getId());
			pst.executeUpdate();
			pst.close(); // 关闭
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		return false;
		
	}
    public List<Book>  selectBook(String name) {
    	List<Book> list =new ArrayList<Book>();
    	String sql ="select * from book where name=?";
    	Connection conn = DbHelper.getConnection();
    	
    	Book book=null;
    	try {
			PreparedStatement pst =conn.prepareStatement(sql);
              pst.setString(1, name);
			ResultSet rst = pst.executeQuery();
			while (rst.next()) {
				
				book = new Book();
				book.setId(rst.getInt("id"));
				book.setName(rst.getString("name"));
				book.setAuthor(rst.getString("author"));
				book.setCategory(rst.getString("category"));
				list.add(book);
			}
			pst.close(); // 关闭
			rst.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
    	
    	
    	
		return list;
    	
    }

	
	
	}

