import java.util.Scanner;

public class S12 
    {public static void main(String[] args)     
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) 
            {array[i] = scanner.nextInt();}
        if (n == 0) 
            {System.out.println("The new length of the array after removing duplicates: 0");
            System.out.println("The array after removing duplicates: ");}
        else 
            {int uniqueIndex = 0;
            for (int i = 1; i < n; i++) 
                {if (array[i] != array[uniqueIndex]) 
                    {uniqueIndex++;
                    array[uniqueIndex] = array[i];}}
            int newLength = uniqueIndex + 1;
            System.out.println("The new length of the array after removing duplicates: " + newLength);
            System.out.println("The array after removing duplicates: ");
            for (int i = 0; i < newLength; i++) 
                {System.out.print(array[i] + " ");}}

        scanner.close();}}
