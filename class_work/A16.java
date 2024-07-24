// Write a program to find the number of composite numbers in an array of elements
import java.util.Scanner;
public class A16 {
    public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
            {numbers[i] = scanner.nextInt();}
        int compositeCount = 0;
        for (int i = 0; i < n; i++) 
            {int number = numbers[i];
            boolean isComposite = false;
            if (number > 1) 
                {for (int j = 2; j <= Math.sqrt(number); j++) 
                    {if (number % j == 0) 
                        {isComposite = true;
                        break;}}}
            if (isComposite) 
                {compositeCount++;}}
        System.out.println("Number of composite numbers: " + compositeCount);}}
