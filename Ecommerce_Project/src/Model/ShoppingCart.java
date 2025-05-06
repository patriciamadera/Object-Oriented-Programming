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

