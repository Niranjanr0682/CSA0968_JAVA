
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.sql.PreparedStatement;


// public class ADatabaseSelect{
//     public static void main(String[] args) {
//         // Replace with your database details
//         String url = "jdbc:mysql://localhost:3306/resourse";
//         String username = "root";
//         String password = "032918";

//         try {
//             // Load MySQL JDBC Driver
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             // Establishing a connection
//             try (Connection connection = DriverManager.getConnection(url, username, password);
//                  Statement statement = connection.createStatement();
//                  // Replace "SELECT * FROM your emp" with your actual SQL query
//                  ResultSet resultSet = statement.executeQuery("SELECT * FROM ")) {
//                 // Processing the result
//                 while (resultSet.next()) {
//                     int id = resultSet.getInt("empno"); // replace "id" with the name of your column
//                     String name = resultSet.getString("ename"); // replace "name" with the name of your column
//                     System.out.println("ID: " + id + ", Name: " + name);
//                 }//WHILE LOOP END
//             }
//         } //TRY BLOCK END
// catch (ClassNotFoundException e) {
//             System.out.println("MySQL JDBC Driver not found.");
//             e.printStackTrace();
//         } catch (SQLException e) {
//             System.out.println("Connection failed! Check output console");
//             e.printStackTrace();
//   }
//     }
// }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ADatabaseSelect {
    public static void selectResources() {
        // Replace with your database details
        String url = "jdbc:mysql://localhost:3306/resourse";
        String username = "root";
        String password = "032918";
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Open a connection
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                // Create a SQL query to select data
                String sql = "SELECT * FROM it";
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(sql)) {
                    // Loop through the result set and print the data
                    while (rs.next()) {
                        int empno = rs.getInt("empid");
                        String ename = rs.getString("ename");
                        System.out.println("Empid: " + empno + ", EName: " + ename);
                    }
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
