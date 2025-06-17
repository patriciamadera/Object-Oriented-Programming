package Model;

import Exceptions.PaymentFailedException;

public class CardPayment implements PaymentProcess {
    private double amount;

    @Override
    public void startPayment(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("El monto debe ser mayor a 0.");
        }
        this.amount = amount;
        System.out.println("Starting card payment for: $" + amount);
    }

    @Override
    public boolean verifyPayment() {
        System.out.println("Verifying card payment...");
        return true; // Puedes cambiarlo para probar fallos
    }

    @Override
    public void confirmPayment() {
        System.out.println("Card payment confirmed.");
    }

    public void process() throws PaymentFailedException {
        startPayment(amount);
        if (!verifyPayment()) {
            throw new PaymentFailedException("Falló la verificación del pago con tarjeta.");
        }
        confirmPayment();
    }
}
