package Model;
import Exceptions.PaymentFailedException;

public class PayPalPayment implements PaymentProcess {
    private double amount;

    @Override
    public void startPayment(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("El monto debe ser mayor a 0.");
        }
        this.amount = amount;
        System.out.println("Starting PayPal payment for: $" + amount);
    }

    @Override
    public boolean verifyPayment() {
        System.out.println("Verifying PayPal payment...");
        return true;
    }

    @Override
    public void confirmPayment() {
        System.out.println("PayPal payment confirmed.");
    }

    public void process() throws PaymentFailedException {
        startPayment(amount);
        if (!verifyPayment()) {
            throw new PaymentFailedException("Falló la verificación del pago con PayPal.");
        }
        confirmPayment();
    }
}
