
// Write a Java program that prompts the user to enter the size of an array and 
// then allows the user to input the elements of the array. The program should then 
// determine and display the minimum and maximum elements of the array.
import java.util.Scanner;
public class A15
    {public static void main(String[] args) 
    {Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
        {System.out.print("Enter element ["+(i+1)+"] :  ");
            arr[i] = sc.nextInt();}
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) 
        {if (arr[i] < min) 
            {min = arr[i];}
        if (arr[i] > max) 
            {max = arr[i];}}
    System.out.println("The minimum element of the array is: " + min);
    System.out.println("The maximum element of the array is: " + max);}}
    