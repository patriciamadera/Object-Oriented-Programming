package Model;

public class Inventory {
	private int id;
    private int productId;
    private int quantityInStock;

    public Inventory(int id, int productId, int quantityInStock) {
        this.id = id;
        this.productId = productId;
        this.quantityInStock = quantityInStock;
    }

    public void updateInventory(int quantity) {
        this.quantityInStock = quantity;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getQuantityInStock() { return quantityInStock; }
    public void setQuantityInStock(int quantityInStock) { this.quantityInStock = quantityInStock; }

}
