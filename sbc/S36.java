import java.util.Scanner;

class Employee {
    private String name;
    private double basePay;
    private double houseRentAllowance;
    private double dearnessAllowance;
    private double tax;
    private double providentFund;

    public Employee(String name, double basePay, double hraPercentage, double daPercentage, double taxPercentage, double pfPercentage) {
        this.name = name;
        this.basePay = basePay;
        this.houseRentAllowance = basePay * (hraPercentage / 100);
        this.dearnessAllowance = basePay * (daPercentage / 100);
        this.tax = basePay * (taxPercentage / 100);
        this.providentFund = basePay * (pfPercentage / 100);
    }

    public double calculateGrossSalary() {
        return basePay + houseRentAllowance + dearnessAllowance;
    }

    public double calculateDeductions() {
        return tax + providentFund;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeductions();
    }

    public void displaySalaryDetails() {
        System.out.println("Salary Details for " + name + ":");
        System.out.println("Base Pay: $" + basePay);
        System.out.println("House Rent Allowance (HRA): $" + houseRentAllowance);
        System.out.println("Dearness Allowance (DA): $" + dearnessAllowance);
        System.out.println("Tax: $" + tax);
        System.out.println("Provident Fund (PF): $" + providentFund);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Total Deductions: $" + calculateDeductions());
        System.out.println("Net Salary: $" + calculateNetSalary());
    }
}

public class S36{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter base pay: $");
        double basePay = scanner.nextDouble();
        System.out.print("Enter House Rent Allowance (HRA) percentage: ");
        double hraPercentage = scanner.nextDouble();
        System.out.print("Enter Dearness Allowance (DA) percentage: ");
        double daPercentage = scanner.nextDouble();
        System.out.print("Enter Tax percentage: ");
        double taxPercentage = scanner.nextDouble();
        System.out.print("Enter Provident Fund (PF) percentage: ");
        double pfPercentage = scanner.nextDouble();

        Employee employee = new Employee(name, basePay, hraPercentage, daPercentage, taxPercentage, pfPercentage);

        employee.displaySalaryDetails();
    }
}
