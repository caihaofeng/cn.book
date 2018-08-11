package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
/**
 * �������ݿ�
 * 
 */
public class DbHelper {
	private static String url = "jdbc:mysql://localhost:3306/jsp"; // ���ݿ��ַ
	private static String userName = "root"; // ���ݿ��û���
	private static String passWord = "root"; // ���ݿ�����
	private static Connection conn = null;
 
	private DbHelper() {
 
	}
 
	public static Connection getConnection() {
		if (null == conn) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, userName, passWord);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
 
	public static void main(String[] args) { // �������ݿ��Ƿ���ͨ
		System.err.println(getConnection());
	}
}
