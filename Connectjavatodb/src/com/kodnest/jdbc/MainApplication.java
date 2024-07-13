package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/kodnest";
		String username="root";
		String password="Blackpink@3";
	
//		String sql1="create table red(pid int, pname varchar(20))";
//		String sql="insert into red values(1,'john')";
//		String sq="update red set pname='jack' where pid=1";
//		String sq3="delete from red where pid=?";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the pid where to delete ");
//		int pid =scan.nextInt();
		
		String sql="select * from student";
		
		Connection con=DriverManager.getConnection(url,username,password);
//		PreparedStatement pst = con.prepareStatement(sq3);
		
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		System.out.println("succes");
		
//		stmt.execute(sql1);
//		stmt.execute(sql);
//		stmt.executeUpdate(sq);
//		pst.setInt(1,pid);
//		pst.executeUpdate(sq3);
//		System.out.println("success");
		
	
	}

}
