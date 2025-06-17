package Model;

import Exceptions.InsufficientInventoryException;
import Exceptions.PaymentFailedException;

public class Main {
    public static void main(String[] args) {
        // === Singleton Pattern ===
        SystemConfiguration config = SystemConfiguration.getInstance();
        System.out.println("Database URL: " + config.getDatabaseUrl());
        System.out.println("UI Theme: " + config.getUiTheme());

        // === Factory Pattern ===
        Product physicalProduct = EntityFactory.createProduct("physical");
        Product digitalProduct = EntityFactory.createProduct("digital");

        Client clientUser = EntityFactory.createUser("client");
        Client adminUser = EntityFactory.createUser("admin");

        // Mostrar productos y roles
        physicalProduct.displayDetails();
        digitalProduct.displayDetails();
        clientUser.displayRole();
        adminUser.displayRole();

        // === Observer Pattern ===
        OrderStatusNotifier orderNotifier = new OrderStatusNotifier();
        orderNotifier.addObserver(new UIObserver());
        orderNotifier.addObserver(new InventoryObserver());
        orderNotifier.setOrderStatus("Processing");

        // === Manejo de excepción personalizada: InsufficientInventoryException ===
        try {
            System.out.println("\nReduciendo stock...");
            physicalProduct.reduceStock(5);  // Asegúrate de que el stock inicial sea mayor o ajusta aquí
        } catch (InsufficientInventoryException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // === Proceso de Pago con Excepciones ===
        System.out.println("\n=== Simulación de pago con tarjeta ===");
        CardPayment cardPayment = new CardPayment();
        try {
            cardPayment.startPayment(150.0);
            cardPayment.process();
        } catch (PaymentFailedException e) {
            System.out.println("Error en el pago con tarjeta: " + e.getMessage());
        }

        System.out.println("\n=== Simulación de pago con PayPal ===");
        PayPalPayment paypalPayment = new PayPalPayment();
        try {
            paypalPayment.startPayment(-100.0); // Monto inválido para probar excepción
            paypalPayment.process();
        } catch (PaymentFailedException e) {
            System.out.println("Error en el pago con PayPal: " + e.getMessage());
        }
    }
}
