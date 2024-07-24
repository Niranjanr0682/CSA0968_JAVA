// Write a program using function to calculate the simple interest. Suppose the customer
// is a senior citizen. He is being offered 12 percent rate of interest; for all other 
// customers, the ROI is 10 percent.
import java.util.Scanner;
public class A19 
    {public static void main(String[] args) 
        {Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Is customer a senior citizen (y/n): ");
        char isSeniorCitizen = scanner.next().charAt(0);
        double rateOfInterest;
        if (isSeniorCitizen == 'y' || isSeniorCitizen == 'Y') 
            {rateOfInterest = 12.0;}
        else 
            {rateOfInterest = 10.0;}
        double interest = (principal * years * rateOfInterest) / 100;
        System.out.println("Interest: " + interest);}}
