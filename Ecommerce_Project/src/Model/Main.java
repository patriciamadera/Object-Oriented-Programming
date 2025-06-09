
// Test
/*package Model;
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
}*/

package Model;

public class Main {
    public static void main(String[] args) {
        // === Singleton Pattern: System Configuration ===
        SystemConfiguration config = SystemConfiguration.getInstance();
        System.out.println("Database URL: " + config.getDatabaseUrl());
        System.out.println("UI Theme: " + config.getUiTheme());

        // === Factory Pattern: Creating Product and User ===
        Product physicalProduct = EntityFactory.createProduct("physical");
        physicalProduct.displayDetails();

        Product digitalProduct = EntityFactory.createProduct("digital");
        digitalProduct.displayDetails();

        Client clientUser = EntityFactory.createUser("client");
        clientUser.displayRole();

        Client adminUser = EntityFactory.createUser("admin");
        adminUser.displayRole();

        // === Observer Pattern: Order Status Notification ===
        OrderStatusNotifier orderNotifier = new OrderStatusNotifier();

        // Observers
        UIObserver uiObserver = new UIObserver();
        InventoryObserver inventoryObserver = new InventoryObserver();

        // Subscribe observers
        orderNotifier.addObserver(uiObserver);
        orderNotifier.addObserver(inventoryObserver);

        // Change order status to trigger notifications
        orderNotifier.setOrderStatus("Processing");
        orderNotifier.setOrderStatus("Shipped");
        orderNotifier.setOrderStatus("Delivered");
    }
}




