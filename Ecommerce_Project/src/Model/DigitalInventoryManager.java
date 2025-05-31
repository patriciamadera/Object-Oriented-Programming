package Model;

import java.util.ArrayList;
import java.util.List;

public class DigitalInventoryManager extends InventoryManager {
    private List<DigitalProduct> digitalInventory = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        if (product instanceof DigitalProduct) {
            digitalInventory.add((DigitalProduct) product);
            System.out.println("Digital product added: " + product.getName());
        }
    }

    @Override
    public void removeProduct(int productId) {
        digitalInventory.removeIf(p -> p.getId() == productId);
        System.out.println("Digital product removed with ID: " + productId);
    }

    @Override
    public void updateStock(int productId, int newStock) {
        for (DigitalProduct p : digitalInventory) {
            if (p.getId() == productId) {
                p.setStock(newStock);
                System.out.println("Stock updated for digital product ID: " + productId);
            }
        }
    }
}

