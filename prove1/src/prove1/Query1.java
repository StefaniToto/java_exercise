package prove1;

import java.sql.*;

public class Query1 {
    
    public static void main (String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/web_student_tracker";
            Connection conn = DriverManager.getConnection(url,"root","s");
            
            Statement stmt = conn.createStatement();
            ResultSet rs;
            
            rs = stmt.executeQuery("SELECT * FROM student ");
            while ( rs.next() ) {
                String lastName = rs.getString("id");
                System.out.println(lastName);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        
    }

}