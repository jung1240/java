package sub1;

import java.sql.Connection;
import java.sql.DriverManager;


/*
 * ��¥ : 2020/11/25
 * �̸� : ������
 * ���� : JAVA �����ͺ��̽� ���α׷���(JDBC) �ǽ� ���� p522
 */
public class JDBCTest {
	
	public static void main(String[] args) {
		
		// DB����
		String host ="jdbc:mysql://192.168.10.114:3306/jyr";
		String user ="jyr";
		String pass ="1234";
		
		try {
			// 1�ܰ� - JDBC����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if (conn != null) {
				System.out.println("�����ͺ��̽� ���� ����!!!");
			}
			
			// 3�ܰ� - SQL ���ఴü ����
			
			
			// 4�ܰ� - SQL ����
			
			
			// 5�ܰ� - ����� ó��(SELECT�� ���)
			
			
			// 6�ܰ� - �����ͺ��̽� ����
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����...");

		
		
		
		
		
		
	}
}