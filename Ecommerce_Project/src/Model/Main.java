package Model;

public class Main {
    public static void main(String[] args) {
        Product p1 = new PhysicalProduct(1, "Laptop", "Computadora portátil", null, 0, 1200.0, 0, true, 2.5, "30x20x3");
        Product p2 = new DigitalProduct(2, "DIG-002" ,"E-book", "Libro digital", 0 ,15.0, 1 ,true, "PDF", 5.0);

        ProductManager manager = new ProductManager();
        manager.showProductInfo(p1);
        manager.showProductInfo(p2);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1, 1);
        cart.addProduct(2, 3);
        cart.addProduct("Mouse", 25.5, 2);

        System.out.println("\nProductos en el carrito:");
        for (CartItem item : cart.getItems()) {
            System.out.println("- " + item.getProduct().getName() + " x " + item.getQuantity());
        }
    }
}

