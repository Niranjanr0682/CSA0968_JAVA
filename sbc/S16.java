import java.util.Scanner;

public class S16 
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int numDigits = 0;
        while (temp != 0) 
            {numDigits++;
            temp /= 10;}
        int sum = 0;
        temp = number;
        while (temp != 0) 
            {int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < numDigits; i++) 
                {power *= digit;}
            sum += power;
            temp /= 10;}
        if (sum == number) 
            {System.out.println("Armstrong");} 
        else 
            {System.out.println("Not Armstrong");}
        
        scanner.close();}}
