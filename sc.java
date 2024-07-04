import java.util.Scanner;
public class sc
{public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s1,s2 = "";
    s1=sc.nextLine();
    int i,len = s1.length(); 
    for(i=0;i<=len-1;i++)
    {char ch = s1.charAt(i);
        if(!Character.isLetterOrDigit(ch))
        {s2 = s2 + ch;}}
        int l1 = s2.length();
            System.out.println("no of special character in the string : "+l1);}}
