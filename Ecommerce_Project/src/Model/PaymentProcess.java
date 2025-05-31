package Model;

public interface PaymentProcess {
    void startPayment(double amount);
    boolean verifyPayment();
    void confirmPayment();
}
