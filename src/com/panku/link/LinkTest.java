
package com.panku.link;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LinkTest {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/mmpbe?allowMultiQueries=true&useUnicode=true&characterEncoding=utf-8";
			String user = "sa";
			String password = "sa";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
