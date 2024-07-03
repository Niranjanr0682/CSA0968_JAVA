import java.util.Scanner;
public class fd {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        System.out.println("Enter c: ");
        c = input.nextInt();
        if (a>b && a>c)
        {System.out.println("a is greater"+a);}
        else if ((b>a && b>c)) 
        {System.out.println("b is greater"+b);}
        else 
        {System.out.println("c is greater"+c);}
}}

