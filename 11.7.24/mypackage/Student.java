package mypackage;

public class Student 
    {private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) 
        {this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;}

    public void display() 
        {System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (int mark : marks) 
            {System.out.print(mark + " ");}
        System.out.println();}

    public int calculateTotalMarks() 
        {int total = 0;
        for (int mark : marks) 
            {total += mark;}
        return total;}

    public double calculatePercentage() 
        {int totalMarks = calculateTotalMarks();
        return (totalMarks / (double) (marks.length * 100)) * 100;}}

