class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  
    }
}


public class MyException {
    public static void main(String[] args) {
        int age = 40;
        try {
            if (age<60) {
                throw new InvalidAgeException("age should not be lesser");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        System.out.println();
        }
    }
}