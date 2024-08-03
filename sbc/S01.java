import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three integers:");

        try {
            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());
            int num3 = Integer.parseInt(scanner.next());

            if (num1 == num2 && num1 == num3) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integer values only.");
        } finally {
            scanner.close();
        }
    }
}
