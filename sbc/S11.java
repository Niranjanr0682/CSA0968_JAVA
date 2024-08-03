import java.util.Scanner;
import java.util.Stack;

public class S11 
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        for (char ch : expression.toCharArray()) 
            {if (ch == '(') 
                {stack.push(ch);} 
            else if (ch == ')') 
                {if (stack.isEmpty()) 
                    {isBalanced = false;
                    break;}
                stack.pop();}}
        if (!stack.isEmpty()) 
            {isBalanced = false;}
        if (isBalanced) 
            {System.out.println("Balanced");} 
        else 
            {System.out.println("Not Balanced");}
        
        scanner.close();}}
