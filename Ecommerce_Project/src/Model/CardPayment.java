package Model;

public class CardPayment implements PaymentProcess {
    @Override
    public void startPayment(double amount) {
        System.out.println("Starting card payment for: $" + amount);
    }

    @Override
    public boolean verifyPayment() {
        System.out.println("Verifying card payment...");
        return true; // Simulating success
    }

    @Override
    public void confirmPayment() {
        System.out.println("Card payment confirmed.");
    }
}
