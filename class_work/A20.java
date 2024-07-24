//write a Java Program to Find Even Sum of Fibonacci Series Till number N
import java.util.Scanner;
public class A20
    {public static void main(String[] args) 
    {Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number N: ");
    int N = scanner.nextInt();
    int f1 = 0, f2 = 1, sum = 0;
    while (f1 <= N) 
        {if (f1 % 2 == 0) 
            {sum += f1;}
        int f3 = f1 + f2;
        f1 = f2;
        f2 = f3;}
        System.out.println("Sum of even Fibonacci numbers till " + N + ": " + sum);}}
