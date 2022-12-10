package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CoSodao {
	public Connection cn;
	public void KetNoi() throws Exception {
		try {
			//b1: Xac dinh he qtcsdl
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("OK buoc 1");
			cn=DriverManager.getConnection("jdbc:sqlserver://HOANGDUC:1433;databaseName=alphaShop;user=sa; password=123");
			System.out.println("OK buoc 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] ts) {
		try {
			CoSodao cs = new CoSodao();
			cs.KetNoi();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
