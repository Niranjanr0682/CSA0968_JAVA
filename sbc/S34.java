import java.util.Scanner;

public class S34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();
        double tax = 0.0;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 20000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 50000) {
            tax = (10000 * 0) + (10000 * 0.10) + (income - 20000) * 0.20;
        } else {
            tax = (10000 * 0) + (10000 * 0.10) + (30000 * 0.20) + (income - 50000) * 0.30;
        }
        System.out.println("Your income tax is: $" + tax);
    }
}
