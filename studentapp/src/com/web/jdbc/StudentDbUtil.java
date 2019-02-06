package com.web.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.web.jdbc.Student;
import java.sql.*;

public class StudentDbUtil {

	
	private DataSource dataSource;

	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	
	public List<Student> getStudents() throws Exception {
		
	List<Student> students = new ArrayList<>();
		
	
	
		ResultSet myRs = null;
		
		 String url = "jdbc:mysql://localhost:3306/web_student_tracker";
         
       

		try {
			// get a connection
		
			Connection myConn = DriverManager.getConnection(url,"root","s");
           	
			
			// create sql statement
			String sql = "select * from student ";
			
			Statement myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
				
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				
				// create new student object
				Student tempStudent = new Student(id, firstName, lastName, email);
				
				// add it to the list of students
				students.add(tempStudent);				
			}
		return students;	
	}
		finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
	
}
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
			System.err.println("Got an exception! ");
            System.err.println(exc.getMessage());
        
		}
	}

}