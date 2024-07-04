import java.util.Scanner;
public class rv
{public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s1,vow = "aeiouAEIOU",s2 = "";
    s1=sc.nextLine();
    int i, len = s1.length(); 
    for(i=0;i<=len-1;i++)
    {char ch = s1.charAt(i);
    if (vow.indexOf(ch)== -1) 
        {s2 = s2 +ch;}}
        System.out.println("String after removing vowels is "+s2);}}
        

