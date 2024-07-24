// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

// public class ADatabaseUpdate {
//     public static void main(String[] args) {
//         // Replace with your database details
//         String url = "jdbc:mysql://localhost:3306/resourse";
//         String username = "root";
//         String password = "032918";

//         try {
//             // Load MySQL JDBC Driver
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             // Establishing a connection
//             try (Connection connection = DriverManager.getConnection(url, username, password)) {
//                 // Prepare the SQL update statement
//                 String updateSQL = "UPDATE it SET empid = ? WHERE ename = ?";
//                 try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
//                     // Set the parameters for the prepared statement
//                     preparedStatement.setInt(1, 999); // New empno
//                     preparedStatement.setString(2, "Ganesh"); // Employee name

//                     // Execute the update statement
//                     int rowsUpdated = preparedStatement.executeUpdate();
//                     System.out.println("Rows updated: " + rowsUpdated);
//                 }
//             }
//         } catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Connection failed! Check output console");
//             e.printStackTrace();
//         }
//     }
// }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ADatabaseUpdate {
    public static void updateResource() {
        // Replace with your database details
        String url = "jdbc:mysql://localhost:3306/resourse";
        String username = "root";
        String password = "032918";
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                // Prepare the SQL update statement
                String updateSQL = "UPDATE resourse SET empid = ? WHERE ename = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                    // Set the parameters for the prepared statement
                    preparedStatement.setInt(1, 999); // New empno
                    preparedStatement.setString(2, "Ganesh"); // Employee name
                    // Execute the update statement
                    int rowsUpdated = preparedStatement.executeUpdate();
                    System.out.println("Rows updated: " + rowsUpdated);
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
