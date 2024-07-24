// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.sql.PreparedStatement;
// public class ADatabaseInsert{
//     public static void main(String[] args) {
//         // Replace with your database details
//         String url = "jdbc:mysql://localhost:3306/resourse";
//         String username = "root";
//         String password = "032918";
//         try {
//             // Load MySQL JDBC Driver
//             Class.forName("com.mysql.cj.jdbc.Driver");
//                         // Open a connection
//             try (Connection conn = DriverManager.getConnection(url, username, password)) {
//                 // Create a SQL query to insert data
//                 String sql = "INSERT INTO emp (empno, ename) VALUES (?, ?)";
//                 // Create a PreparedStatement for setting parameters
//                 try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//                     pstmt.setInt(1, 900); // Set the value of the first column
//                     pstmt.setString(2, "Ganesh"); // Set the value of the second column
//                     // Execute the insert statement
//                     pstmt.executeUpdate();
//                     System.out.println("Record inserted successfully");
//                 }            }        } catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Database connection or query failed!");
//             e.printStackTrace();
//         }
//     }  }


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ADatabaseInsert {
    public static void insertResource() {
        // Replace with your database details
        String url = "jdbc:mysql://localhost:3306/resourse";
        String username = "root";
        String password = "032918";
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Open a connection
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                // Create a SQL query to insert data
                String sql = "INSERT INTO it (empid, ename) VALUES (?, ?)";
                // Create a PreparedStatement for setting parameters
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setInt(1, 800); // Set the value of the first column
                    pstmt.setString(2, "ramesh"); // Set the value of the second column
                    // Execute the insert statement
                    pstmt.executeUpdate();
                    System.out.println("Record inserted successfully");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection or query failed!");
            e.printStackTrace();
        }
    }
}
