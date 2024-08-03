import java.util.Scanner;

public class S25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent (y): ");
        int y = scanner.nextInt();
        scanner.close();

        double result = power(x, y);

        System.out.println(x + " raised to the power of " + y + " is: " + result);
    }

    public static double power(double base, int exponent) {
        double result = 1;
        int positiveExponent = Math.abs(exponent);
        
        for (int i = 0; i < positiveExponent; i++) {
            result *= base;
        }
        
        if (exponent < 0) {
            return 1 / result;
        }
        
        return result;
    }
}
