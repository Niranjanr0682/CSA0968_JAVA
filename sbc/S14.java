import java.util.Scanner;

public class S14 
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        int m = str1.length();
        int k = str2.length();
        int[][] lcs = new int[m + 1][k + 1];
        for (int i = 0; i <= m; i++) 
            {for (int j = 0; j <= k; j++) 
                {if (i == 0 || j == 0) 
                    {lcs[i][j] = 0;}
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
                    {lcs[i][j] = lcs[i - 1][j - 1] + 1;} 
                else 
                    {lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);}}}
        int lcsLength = lcs[m][k];
        System.out.println("The length of the longest common subsequence: " + lcsLength);
        
        scanner.close();}}
