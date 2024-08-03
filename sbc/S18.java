import java.util.Scanner;

public class S18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;}
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;}
        System.out.println("The GCD of the two numbers is: " + a);
        scanner.close();
    }
}
