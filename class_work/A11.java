// write a program to count the total number of vowels in the string
import java.util.Scanner;
public class A11
{public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s1,vow = "aeiouAEIOU",s3 = "";
    s1=sc.nextLine();
    int i,len1, len = s1.length(); 
    for(i=0;i<=len-1;i++)
    {char ch = s1.charAt(i);
    if (vow.indexOf(ch)== -1) 
        {}
    else
        {s3 = s3 +ch;}}
    len1 =s3.length();
    System.out.println("Total number of vowel from the string is "+len1);}}
        

