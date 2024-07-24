// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

// public class ADatabaseDelete {
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
//                 // Prepare the SQL delete statement
//                 String deleteSQL = "DELETE FROM it WHERE ename = ?";
//                 try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
//                     // Set the parameter for the prepared statement
//                     preparedStatement.setString(1, "Ganesh"); // Employee name

//                     // Execute the delete statement
//                     int rowsDeleted = preparedStatement.executeUpdate();
//                     System.out.println("Rows deleted: " + rowsDeleted);
//                 }
//             }
//         } catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Connection failed! Check output console");
//             e.printStackTrace();
//         }
//     }  }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ADatabaseDelete {
    public static void deleteResourse() {
        // Replace with your database details
        String url = "jdbc:mysql://localhost:3306/resourse";
        String username = "root";
        String password = "032918";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establishing a connection
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                // Prepare the SQL delete statement
                String deleteSQL = "DELETE FROM it WHERE ename = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
                    // Set the parameter for the prepared statement
                    preparedStatement.setString(1, "Ganesh"); // Employee name

                    // Execute the delete statement
                    int rowsDeleted = preparedStatement.executeUpdate();
                    System.out.println("Rows deleted: " + rowsDeleted);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check output console");
            e.printStackTrace();
        }
    }
}

