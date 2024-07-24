// write a java program to do fibonacci series 
import java.util.Scanner;
public class A06 
{public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n=input.nextInt();
        int f1=0,f2=1,f3;
        System.out.print(f1+" "+f2+" ");
        for (int i=2;i<n;++i)
            {f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;}}}

