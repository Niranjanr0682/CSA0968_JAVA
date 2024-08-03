public class S50 {

    public static void main(String[] args) {
        int n = 5;
        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("The number of terms must be a positive integer.");
            return;
        }

        int first = 0;
        int second = 1;

        if (n > 0) {
            System.out.print(first);
        }
        if (n > 1) {
            System.out.print(" " + second);
        }

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }
}
