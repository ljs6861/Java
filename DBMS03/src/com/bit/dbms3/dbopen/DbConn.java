package com.bit.dbms3.dbopen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

	public Connection conn = null;
	
	private String url = "jdbc:mysql://localhost/bitdb?useSSL=false";
	private String user = "root";
	private String passwd = "!BitCom0228";
	
	public DbConn(){
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("Driver Loading Sucess!!");
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("DB Connection Success!!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
