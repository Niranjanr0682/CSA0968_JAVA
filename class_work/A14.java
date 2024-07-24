//write a java program to print the vowels and consonents seperately from the string
import java.util.Scanner;
public class A14
{public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s1,vow = "aeiouAEIOU",s2 = "",s3 = "";
    s1=sc.nextLine();
    int i, len = s1.length(); 
    for(i=0;i<=len-1;i++)
    {char ch = s1.charAt(i);
    if (vow.indexOf(ch)== -1) 
        {s2 = s2 +ch;}
    else
        {s3 = s3 +ch;}}
    System.out.println("String without vowels "+s2);
    System.out.println("vowels from the string "+s3);}}
        

