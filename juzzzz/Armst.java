//java armstrong number
import java.util.Scanner;
public class Armst
{public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int a,tot = 0;
        a = n;
        while (n>0)
        {int r = n % 10;
            tot = tot+(r*r*r);
            n = n/10;}
            if (a == tot)
                {System.out.println("The number is an Armstrong number");}
            else
                {System.out.println("The number is not an Armstrong number");}}}
