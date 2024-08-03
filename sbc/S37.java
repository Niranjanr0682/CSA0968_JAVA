import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " x " + quantity + " = $" + getTotalPrice();
    }
}

class ShoppingCart {
    private ArrayList<Product> cart;
    private double discount;

    public ShoppingCart() {
        cart = new ArrayList<>();
        discount = 0.0;
    }

    public void addProduct(Product product) {
        for (Product p : cart) {
            if (p.getName().equalsIgnoreCase(product.getName())) {
                p.setQuantity(p.getQuantity() + product.getQuantity());
                return;
            }
        }
        cart.add(product);
    }

    public void removeProduct(String productName) {
        cart.removeIf(product -> product.getName().equalsIgnoreCase(productName));
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : cart) {
            total += product.getTotalPrice();
        }
        return total - (total * discount / 100);
    }

    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Product product : cart) {
                System.out.println(product);
            }
            System.out.println("Total price: $" + calculateTotal());
        }
    }
}

public class S37{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nOnline Shopping Cart:");
            System.out.println("1. Add product to cart");
            System.out.println("2. Remove product from cart");
            System.out.println("3. View cart");
            System.out.println("4. Apply discount");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: $");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter the name of the product to remove: ");
                    String productName = scanner.nextLine();
                    cart.removeProduct(productName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.print("Enter discount percentage: ");
                    double discount = scanner.nextDouble();
                    cart.applyDiscount(discount);
                    System.out.println("Discount applied.");
                    break;
                case 5:
                    cart.displayCart();
                    System.out.println("Proceeding to checkout...");
                    return;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
