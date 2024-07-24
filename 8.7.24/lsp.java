import java.util.Scanner;
public class lsp 
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        row = (row + 1) / 2;
        for (int i = 1; i <= row; i++) 
            {for (int j = 1; j <= i; j++) 
                {System.out.print("*");}
            System.out.println();}
        for (int i = row - 1; i >= 1; i--) 
            {for (int j = 1; j <= i; j++) 
                {System.out.print("*");}
            System.out.println();}}}
