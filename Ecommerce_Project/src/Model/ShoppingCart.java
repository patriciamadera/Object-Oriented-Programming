package Model;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private int clientId;
    private List<CartItem> items;
    private double total;

    // Constructor
    public ShoppingCart(int id, int clientId) {
        this.id = id;
        this.clientId = clientId;
        this.items = new ArrayList<>();
        this.total = 0.0;
    }
    
    public ShoppingCart() {
        this.id = 0;
        this.clientId = 0;
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        boolean found = false;
        for (CartItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                found = true;
                break;
            }
        }
        if (!found) {
            items.add(new CartItem(product, quantity));
        }
        calculateTotal();
    }
    
    public void addProduct(int productId, int quantity) {
        Product product = buscarProductoPorId(productId);
        if (product != null) {
            addProduct(product, quantity);
        }
    }

    // Sobrecarga 2: Agregar por nombre y precio
    public void addProduct(String name, double price, int quantity) {
        Product product = new PhysicalProduct(
            1,                         
            "PPT-001",                 
            name,
            "Producto generado automáticamente",
            10,                         
            price,
            1,                          
            true,                       
            1.5,                        
            "10x10x10"                  
        );
        addProduct(product, quantity);
    }

    // Simulación de búsqueda por ID (crea un producto digital)
    private Product buscarProductoPorId(int id) {
        return new DigitalProduct(
            id,
            "DIGI-" + id,
            "Producto Digital Simulado",
            "Generado automáticamente",
            0,
            9.99,
            1,
            true,
            "MP4",
            100.0
        );
    }

    public void removeProduct(int productId) {
        items.removeIf(item -> item.getProduct().getId() == productId);
        calculateTotal();
    }

    public void clearCart() {
        items.clear();
        total = 0.0;
    }

    private void calculateTotal() {
        total = 0.0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
    }
    
    

    // Getters y Setters
    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }
}

