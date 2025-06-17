package Model;
import java.time.LocalDate;
import Exceptions.PaymentFailedException;

public class Payment {
	private int id;
    private int orderId;
    private LocalDate paymentDate;
    private double paymentAmount;
    private String paymentMethod;

    public Payment(int id, int orderId, LocalDate paymentDate, double paymentAmount, String paymentMethod) {
        this.id = id;
        this.orderId = orderId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() throws PaymentFailedException {
        if (paymentAmount <= 0) {
            throw new PaymentFailedException("El monto del pago debe ser mayor que cero.");
        }
        System.out.println("Pago procesado por: " + paymentAmount);
    }

    public void refundPayment() {
        System.out.println("Pago reembolsado por: " + paymentAmount);
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public LocalDate getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) { this.paymentAmount = paymentAmount; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
}
