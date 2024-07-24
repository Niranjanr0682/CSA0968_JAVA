import java.util.Scanner;
public class rsp
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        rows = rows/2+1 ;
        for (int i = 1; i <= rows; i++) 
            {for (int j = 1; j <= rows - i; j++) 
                {System.out.print(" ");}
            for (int k = 1; k <= i; k++) 
                {System.out.print("*");}
            System.out.println();}
            for (int i = rows-1; i >= 1; i--) 
            {for (int j = 1; j <= rows - i; j++) 
                {System.out.print(" ");}
            for (int k = 1; k <= i; k++) 
                {System.out.print("*");}
            System.out.println();
        }}}
