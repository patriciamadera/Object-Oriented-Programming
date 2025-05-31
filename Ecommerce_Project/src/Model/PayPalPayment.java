package Model;

public class PayPalPayment implements PaymentProcess {
    @Override
    public void startPayment(double amount) {
        System.out.println("Starting PayPal payment for: $" + amount);
    }

    @Override
    public boolean verifyPayment() {
        System.out.println("Verifying PayPal payment...");
        return true; // Simulating success
    }

    @Override
    public void confirmPayment() {
        System.out.println("PayPal payment confirmed.");
    }
}
