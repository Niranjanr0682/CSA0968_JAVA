// write a program to do string compare with two strings
import java.util.Scanner;
public class A07 
{public static void main(String[] args)
    {
        Scanner monk=new Scanner(System.in);
        System.out.print("Enter string 1 :");
        String s1=monk.nextLine();
        System.out.print("Enter string 2:");
        String s2=monk.nextLine();
        int n = s1.compareTo(s2);
        if(n==0)
        {System.out.println("Both strings are equal");}
        else if (n>0)
        {System.out.println("s1 is greater than s2");}
        else
        {System.out.println("s2 is greater than s1");}}}
