import java.util.Scanner;

public class S32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double bill = 0.0;

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = 100 * 1.50 + (units - 100) * 2.00;
        } else {
            bill = 100 * 1.50 + 200 * 2.00 + (units - 300) * 3.00;
        }

        if (bill > 500) {
            bill += bill * 0.10;
        }

        System.out.println("Total Electricity Bill: $" + bill);
    }
}
