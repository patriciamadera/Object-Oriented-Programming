package Model;

import java.util.ArrayList;
import java.util.List;

public class PhysicalInventoryManager extends InventoryManager {
    private List<PhysicalProduct> physicalInventory = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        if (product instanceof PhysicalProduct) {
            physicalInventory.add((PhysicalProduct) product);
            System.out.println("Physical product added: " + product.getName());
        }
    }

    @Override
    public void removeProduct(int productId) {
        physicalInventory.removeIf(p -> p.getId() == productId);
        System.out.println("Physical product removed with ID: " + productId);
    }

    @Override
    public void updateStock(int productId, int newStock) {
        for (PhysicalProduct p : physicalInventory) {
            if (p.getId() == productId) {
                p.setStock(newStock);
                System.out.println("Stock updated for physical product ID: " + productId);
            }
        }
    }
}

