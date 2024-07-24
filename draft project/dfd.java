public class dfd {
    public static void main(String[] args) {
        
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
    } catch (ClassNotFoundException e) {
        System.err.println("MySQL JDBC driver not found: " + e.getMessage());
    }
}
}