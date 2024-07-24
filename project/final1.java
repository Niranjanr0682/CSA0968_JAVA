import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class final1 {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/it_resource_management";
    private static final String USER = "root";
    private static final String PASSWORD = "032918";

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("IT Resource Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create buttons
        JButton insertButton = new JButton("Insert Resource");
        JButton selectButton = new JButton("Select Resources");
        JButton updateButton = new JButton("Update Resource");
        JButton deleteButton = new JButton("Delete Resource");
        JButton searchButton = new JButton("Search Resource");

        // Add action listeners to buttons
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertResource();
            }
        });

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectResources();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResource();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteResource();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchResource();
            }
        });

        // Add buttons to panel
        JPanel panel = new JPanel();
        panel.add(insertButton);
        panel.add(selectButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(searchButton);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }

    // Method to insert a resource
    private static void insertResource() {
        String name = JOptionPane.showInputDialog("Enter Resource Name:");
        String type = JOptionPane.showInputDialog("Enter Resource Type:");
        String status = JOptionPane.showInputDialog("Enter Resource Status:");
        String location = JOptionPane.showInputDialog("Enter Resource Location:");
        String assignedTo = JOptionPane.showInputDialog("Enter Assigned To:");

        String sql = "INSERT INTO resources (name, type, status, location, assigned_to) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, type);
            pstmt.setString(3, status);
            pstmt.setString(4, location);
            pstmt.setString(5, assignedTo);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Resource inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to insert resource!");
        }
    }

    // Method to select and display all resources
    private static void selectResources() {
        String sql = "SELECT * FROM resources";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            StringBuilder results = new StringBuilder();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String status = rs.getString("status");
                String location = rs.getString("location");
                String assignedTo = rs.getString("assigned_to");
                results.append("ID: ").append(id).append(", Name: ").append(name)
                        .append(", Type: ").append(type).append(", Status: ").append(status)
                        .append(", Location: ").append(location).append(", Assigned To: ").append(assignedTo).append("\n");
            }

            JTextArea textArea = new JTextArea(results.toString());
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new java.awt.Dimension(500, 300));
            JOptionPane.showMessageDialog(null, scrollPane, "Resources", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to retrieve resources!");
        }
    }

    // Method to update a resource
    private static void updateResource() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Resource ID to update:"));
        String newStatus = JOptionPane.showInputDialog("Enter new status:");
        String sql = "UPDATE resources SET status = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newStatus);
            pstmt.setInt(2, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Resource updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Resource not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to update resource!");
        }
    }

    // Method to delete a resource
    private static void deleteResource() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Resource ID to delete:"));
        String sql = "DELETE FROM resources WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Resource deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Resource not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to delete resource!");
        }
    }

    // Method to search for a resource by name
    private static void searchResource() {
        String name = JOptionPane.showInputDialog("Enter Resource Name to search:");
        String sql = "SELECT * FROM resources WHERE name LIKE ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + name + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                StringBuilder results = new StringBuilder();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String resourceName = rs.getString("name");
                    String type = rs.getString("type");
                    String status = rs.getString("status");
                    String location = rs.getString("location");
                    String assignedTo = rs.getString("assigned_to");
                    results.append("ID: ").append(id).append(", Name: ").append(resourceName)
                            .append(", Type: ").append(type).append(", Status: ").append(status)
                            .append(", Location: ").append(location).append(", Assigned To: ").append(assignedTo).append("\n");
                }

                JTextArea textArea = new JTextArea(results.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new java.awt.Dimension(500, 300));
                JOptionPane.showMessageDialog(null, scrollPane, "Search Results", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to search for resource!");
        }
    }
}
