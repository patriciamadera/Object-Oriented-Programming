package Model;
import java.time.LocalDate;

public class Order {
	private int id;
    private int clientId;
    private List<CartItem> items;
    private double totalAmount;
    private LocalDate orderDate;
    private String status;

    public Order(int id, int clientId, List<CartItem> items, double totalAmount, LocalDate orderDate, String status) {
        this.id = id;
        this.clientId = clientId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.status = status;
        calculateTotal();
    }

    public void calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        this.totalAmount = total;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public List<CartItem> getItems() { return items; }
    public void setItems(List<CartItem> items) {
        this.items = items;
        calculateTotal();
    }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

}
