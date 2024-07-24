public class Eh {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;
        try {
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e);}
        System.out.println("handle the error" );}}
