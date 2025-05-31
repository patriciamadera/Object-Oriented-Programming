package Model;

public abstract class InventoryManager {
	
    public abstract void addProduct(Product product);
    public abstract void removeProduct(int productId);
    public abstract void updateStock(int productId, int newStock);
}
