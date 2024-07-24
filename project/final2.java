import java.sql.*;
import java.util.Scanner;

public class final2 {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/it_resource_management";
    private static final String USER = "root";
    private static final String PASSWORD = "032918";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nIT Resource Management System");
            System.out.println("1. Insert Resource");
            System.out.println("2. Select Resources");
            System.out.println("3. Update Resource");
            System.out.println("4. Delete Resource");
            System.out.println("5. Search Resource");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    insertResource(scanner);
                    break;
                case 2:
                    selectResources();
                    break;
                case 3:
                    updateResource(scanner);
                    break;
                case 4:
                    deleteResource(scanner);
                    break;
                case 5:
                    searchResource(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to insert a resource
    private static void insertResource(Scanner scanner) {
        System.out.print("Enter Resource Name: ");
        String name = scanner.nextLine();
        String type = "";
        while (true) {
            System.out.print("Enter Resource Type ");
            System.out.print("(1 for Hardware, 2 for Software): ");
            int typeChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            if (typeChoice == 1) {
                type = "Hardware";
                break;
            } else if (typeChoice == 2) {
                type = "Software";
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        System.out.print("Enter Resource Status: ");
        String status = scanner.nextLine();
        System.out.print("Enter Resource Location: ");
        String location = scanner.nextLine();
        System.out.print("Enter Assigned To: ");
        String assignedTo = scanner.nextLine();

        String sql = "INSERT INTO resources (name, type, status, location, assigned_to) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, type);
            pstmt.setString(3, status);
            pstmt.setString(4, location);
            pstmt.setString(5, assignedTo);
            pstmt.executeUpdate();
            System.out.println("Resource inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to insert resource!");
        }
    }

    // Method to select and display all resources
    private static void selectResources() {
        String sql = "SELECT * FROM resources";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\nResources:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String status = rs.getString("status");
                String location = rs.getString("location");
                String assignedTo = rs.getString("assigned_to");
                System.out.printf("ID: %d, Name: %s, Type: %s, Status: %s, Location: %s, Assigned To: %s\n",
                        id, name, type, status, location, assignedTo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to retrieve resources!");
        }
    }

    // Method to update a resource
    private static void updateResource(Scanner scanner) {
        System.out.print("Enter Resource ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new status: ");
        String newStatus = scanner.nextLine();

        String sql = "UPDATE resources SET status = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newStatus);
            pstmt.setInt(2, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Resource updated successfully!");
            } else {
                System.out.println("Resource not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to update resource!");
        }
    }

    // Method to delete a resource
    private static void deleteResource(Scanner scanner) {
        System.out.print("Enter Resource ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String sql = "DELETE FROM resources WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Resource deleted successfully!");
            } else {
                System.out.println("Resource not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete resource!");
        }
    }

    // Method to search for a resource by name
    private static void searchResource(Scanner scanner) {
        System.out.print("Enter Resource Name to search: ");
        String name = scanner.nextLine();

        String sql = "SELECT * FROM resources WHERE name LIKE ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + name + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("\nSearch Results:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String resourceName = rs.getString("name");
                    String type = rs.getString("type");
                    String status = rs.getString("status");
                    String location = rs.getString("location");
                    String assignedTo = rs.getString("assigned_to");
                    System.out.printf("ID: %d, Name: %s, Type: %s, Status: %s, Location: %s, Assigned To: %s\n",
                            id, resourceName, type, status, location, assignedTo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to search for resource!");
        }
    }
}
