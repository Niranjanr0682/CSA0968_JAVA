import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers (separated by spaces): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] numbers = input.split(" ");
        int primeCount = 0;
        int compositeCount = 0;

        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                if (num > 1) {
                    if (isPrime(num)) {
                        primeCount++;
                    } else {
                        compositeCount++;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("'" + number + "' is not a valid integer.");
            }
        }

        System.out.println("Number of prime numbers: " + primeCount);
        System.out.println("Number of composite numbers: " + compositeCount);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
