// write a java program to do matric subtraction get the input from the user
import java.util.Scanner;
public class A23
{public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    int x = sc.nextInt();
    System.out.print("Enter the number of columns : ");
    int y = sc.nextInt();
    int a[][] = new int[x][y],b[][] = new int[x][y],c[][] = new int[x][y];
    System.out.println("Enter the elements of the first matrix:");
    for (int i = 0; i < x; ++i)
        {for (int j = 0; j < y; ++j)
            {System.out.print("Enter element [" + i + "][" + j + "] : ");
            a[i][j] = sc.nextInt();}}
    System.out.println("Enter the elements of the second matrix:");
    for (int i = 0; i < x; ++i)
        {for (int j = 0; j < y; ++j)
            {System.out.print("Enter element [" + i + "][" + j + "] : ");
            b[i][j] = sc.nextInt();}}
    System.out.println("The sum of the two matrices is:");
    for (int i = 0; i < x; ++i)
        {for (int j = 0; j < y; ++j)
            {c[i][j] = a[i][j] - b[i][j];
            System.out.print(c[i][j] + " ");}
            System.out.println(" ");}}}