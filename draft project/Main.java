import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nIT Resource Management System");
            System.out.println("1. Insert Resource");
            System.out.println("2. Select Resources");
            System.out.println("3. Update Resource");
            System.out.println("4. Delete Resource");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    ADatabaseInsert.insertResource();
                    break;
                case 2:
                    ADatabaseSelect.selectResources();
                    break;
                case 3:
                    ADatabaseUpdate.updateResource();
                    break;
                case 4:
                    ADatabaseDelete.deleteResourse();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
