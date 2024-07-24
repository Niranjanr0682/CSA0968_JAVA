// write a java progran to reverse a seting get the input from the user
import java.util.Scanner;
public class A09
{public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    String rev = "";
    int len = str.length();
    for (int i = len - 1; i >= 0; i--)
        {rev = rev + str.charAt(i);}
        System.out.println("Reverse of the string is: " + rev);}}