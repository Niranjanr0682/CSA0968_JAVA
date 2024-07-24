// Find the Mean, Median, Mode of the array of numbers/
import java.util.Arrays;
import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double mean = sum / n;

        Arrays.sort(numbers);
        double median = (n % 2 == 0) ? (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0 : numbers[n / 2];

        int mode = numbers[0], maxCount = 0, currentCount = 1;
        for (int i = 1; i < n; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = numbers[i];
            }
        }

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
}
