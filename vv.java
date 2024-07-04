import java.util.Scanner;
public class vv
{public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s1,s2 = "";
    s1=sc.nextLine();
    int i,len = s1.length(); 
    if(len > 4 && len < 20)
        {for(i=0;i<=len-1;i++)
            {char ch = s1.charAt(i);
            if(!Character.isLetterOrDigit(ch))
                {s2 = s2 + ch;}}
        int l1 = s2.length();
        if(l1==0)
            {System.out.println("The given string is valid");}
        else
            {System.out.println("The given string is not valid");}}
    else
        {{System.out.println("The given string is not valid");}}}}
