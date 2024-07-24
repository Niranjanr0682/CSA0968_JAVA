// Write a Java Program to convert the given decimal to binary and print the reverse 
//  of the binary decimal.
import java.util.Scanner;
public class A17
    {public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the decimal number: ");
    int n=sc.nextInt();
    int rev=0,rem=0,bi=0,i=1;
    while(n>0)
        {rem=n%2;
        bi=bi+(rem*i);
        rev=rev*10+rem;
        i=i*10;
        n=n/2;}
    System.out.println("Binary number is : "+rev);
    System.out.println("The reverse of the binary decimal is : "+rev);}}