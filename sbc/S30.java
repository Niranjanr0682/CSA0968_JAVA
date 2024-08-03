import java.util.Scanner;

public class S30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("The number must be non-negative. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid non-negative integer.");
                scanner.next(); 
            }
        }
        scanner.close();

        String binary = decimalToBinary(number);
        String octal = decimalToOctal(number);

        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
    }

    public static String decimalToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static String decimalToOctal(int number) {
        return Integer.toOctalString(number);
    }
}
