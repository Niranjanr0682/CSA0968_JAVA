import mypackage.Student;

public class main1 
    {public static void main(String[] args) 
        {String name = "Niranjan";
        int rollNumber = 192210682;
        int[] marks = {56, 79, 86, 99, 98};  

        Student student = new Student(name, rollNumber, marks);
        student.display();

        int totalMarks = student.calculateTotalMarks();
        double percentage = student.calculatePercentage();

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");}}
