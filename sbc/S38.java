import java.util.InputMismatchException;
import java.util.Scanner;

public class S38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter the denominator: ");
            double denominator = scanner.nextDouble();

            double result = divide(numerator, denominator);
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }

    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}
