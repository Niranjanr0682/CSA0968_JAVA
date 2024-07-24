public class Eh2 {
    public static void main(String[] args) {
        String[] array = {"10", "20", null, "thirty", "40"};
        
        for (int i = 0; i < array.length; i++) {
            try {
                int num = Integer.parseInt(array[i]);
                System.out.println("Number: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format at index ");
            } catch (NullPointerException e) {
                System.out.println("Error: Null value at index " );
            } catch (Exception e) {
                System.out.println("General error at index ");
            }
        }

        System.out.println("handle the error");
    }
}
