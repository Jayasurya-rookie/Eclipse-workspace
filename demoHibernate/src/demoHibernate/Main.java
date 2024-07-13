package demoHibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) throws Exception {
	        System.out.println("JDBC");

	        // Loading the Driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        String url = "jdbc:mysql://localhost/kodnest1";
	        String username = "root";
	        String password = "Blackpink@3";

	        // Establishing connection
	        Connection connection = DriverManager.getConnection(url, username, password);

	        // Insert values into the table
	        String sql = "insert into Student1 values(?, ?)";
	        Connection conn = null;

	        try {
	            // Taking user input
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Enter the student name:");
	            String name = scan.nextLine();
	            scan.nextLine(); // Consume the newline character
	            System.out.println("Enter the student age:");
	            int age = scan.nextInt();

	            // Create a Student object
	            Student student = new Student(name, age);

	            // Set auto-commit to false
	            connection.setAutoCommit(false);

	            // Create a prepared statement
	            PreparedStatement stat = connection.prepareStatement(sql);
	            stat.setString(1, name);
	            stat.setInt(1, age);


	            // Execute the update
	            int executeUpdate = stat.executeUpdate();

	            // Commit the transaction
	            connection.commit();

	            System.out.println("Success: " + executeUpdate + " row(s) inserted.");
	        } catch (SQLException e) {
	            // Rollback the transaction in case of an exception
	             
	            e.printStackTrace();
	        } 
	    }
	}


