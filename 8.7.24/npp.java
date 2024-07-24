import java.util.Scanner;

public class npp 
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int cn = 1;
        for (int i = 1; i <= n; i++) 
            {for (int j = 1; j <= i; j++) 
                {System.out.print(cn+" ");
                cn++;}
            System.out.println();}}}
