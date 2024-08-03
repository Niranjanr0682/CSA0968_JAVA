import java.util.ArrayList;
import java.util.List;

public class S47 {

    public static void main(String[] args) {
        // Test Case Scenarios
        printPerfectNumbers(3);   // Test Case 1
        printPerfectNumbers(5);   // Test Case 2
        printPerfectNumbers(0);   // Test Case 3
        printPerfectNumbers(1);   // Test Case 4
        printPerfectNumbers(100); // Test Case 5
    }

    // Method to print the first N perfect numbers
    private static void printPerfectNumbers(int n) {
        if (n <= 0) {
            System.out.println("The number must be a positive integer.");
            return;
        }

        List<Integer> perfectNumbers = new ArrayList<>();
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPerfectNumber(num)) {
                perfectNumbers.add(num);
                count++;
            }
            num++;
        }

        // Print results
        if (n == 1) {
            System.out.println("First " + n + " perfect number is: " + perfectNumbers.get(0));
        } else {
            System.out.println("First " + n + " perfect numbers are: " + perfectNumbers);
        }
    }

    // Method to check if a number is perfect
    private static boolean isPerfectNumber(int number) {
        int sum = 1; // 1 is always a divisor of any number
        int sqrt = (int) Math.sqrt(number);

        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number && number != 1; // 1 is not a perfect number
    }
}
