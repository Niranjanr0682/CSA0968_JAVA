import java.util.Scanner;

public class S13 
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= number; i++) 
            {result *= i;}
        System.out.println("The factorial of " + number + " is: " + result);
        scanner.close();}}
