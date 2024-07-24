import java.sql.*;
import java.util.Scanner;

public class final5 {
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
            System.out.println("5. Search Resources");
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
                    searchResources(scanner);
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
        System.out.print("Enter Resource ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Resource Name: ");
        String name = scanner.nextLine();
        String type = "";
        while (true) {
            System.out.print("Enter Resource Type (1 for Hardware, 2 for Software): ");
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

        String sql = "INSERT INTO resources (id, name, type, status, location) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, type);
            pstmt.setString(4, status);
            pstmt.setString(5, location);
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
            System.out.printf("%-10s %-20s %-10s %-10s %-20s\n", "ID", "Name", "Type", "Status", "Location");
            System.out.println("----------------------------------------------------------------------------");

            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String status = rs.getString("status");
                String location = rs.getString("location");
                System.out.printf("%-10s %-20s %-10s %-10s %-20s\n",
                        id, name, type, status, location);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to retrieve resources!");
        }
    }

    // Method to update a resource
    private static void updateResource(Scanner scanner) {
        System.out.print("Enter Resource ID to update: ");
        String id = scanner.nextLine();
        System.out.print("Enter new status: ");
        String newStatus = scanner.nextLine();

        String sql = "UPDATE resources SET status = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newStatus);
            pstmt.setString(2, id);
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
        String id = scanner.nextLine();

        String sql = "DELETE FROM resources WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
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

    // Method to search for resources
    private static void searchResources(Scanner scanner) {
        System.out.println("Search by:");
        System.out.println("1. Name");
        System.out.println("2. Type");
        System.out.print("Choose an option: ");
        int searchChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (searchChoice) {
            case 1:
                searchResourceByName(scanner);
                break;
            case 2:
                searchResourceByType(scanner);
                break;
            default:
                System.out.println("Invalid choice. Returning to main menu.");
        }
    }

    // Method to search for a resource by name
    private static void searchResourceByName(Scanner scanner) {
        System.out.print("Enter Resource Name to search: ");
        String name = scanner.nextLine();

        String sql = "SELECT * FROM resources WHERE name LIKE ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + name + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("\nSearch Results:");
                System.out.printf("%-10s %-20s %-10s %-10s %-20s\n", "ID", "Name", "Type", "Status", "Location");
                System.out.println("----------------------------------------------------------------------------");

                while (rs.next()) {
                    String id = rs.getString("id");
                    String resourceName = rs.getString("name");
                    String type = rs.getString("type");
                    String status = rs.getString("status");
                    String location = rs.getString("location");
                    System.out.printf("%-10s %-20s %-10s %-10s %-20s\n",
                            id, resourceName, type, status, location);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to search for resource!");
        }
    }

    // Method to search for a resource by type
    private static void searchResourceByType(Scanner scanner) {
        String type = "";
        while (true) {
            System.out.print("Enter Resource Type to search (1 for Hardware, 2 for Software): ");
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

        String sql = "SELECT * FROM resources WHERE type = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, type);
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("\nSearch Results:");
                System.out.printf("%-10s %-20s %-10s %-10s %-20s\n", "ID", "Name", "Type", "Status", "Location");
                System.out.println("----------------------------------------------------------------------------");

                while (rs.next()) {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String resourceType = rs.getString("type");
                    String status = rs.getString("status");
                    String location = rs.getString("location");
                    System.out.printf("%-10s %-20s %-10s %-10s %-20s\n",
                            id, name, resourceType, status, location);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to search for resource!");
        }
    }
}
