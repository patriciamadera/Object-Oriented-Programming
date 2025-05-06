package Model;
import java.time.LocalDate;

public class Order {
	private int id;
    private int clientId;
    private int productId;
    private double totalAmount;
    private LocalDate orderDate;
    private String status;

    public Order(int id, int clientId, int productId, double totalAmount, LocalDate orderDate, String status) {
        this.id = id;
        this.clientId = clientId;
        this.productId = productId;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.status = status;
    }

    public void calculateTotal(double price, int quantity) {
        this.totalAmount = price * quantity;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

}
