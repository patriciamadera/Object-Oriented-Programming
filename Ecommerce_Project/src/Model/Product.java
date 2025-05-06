package Model;

public class Product {
	private int id;
    private String productCode;
    private String name;
    private String description;
    private int stock;
    private double price;
    private int categoryId;
    private boolean isActive;

    public Product(int id, String productCode, String name, String description, int stock, double price, int categoryId, boolean isActive) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.categoryId = categoryId;
        this.isActive = isActive;
    }

    public void updateStock(int amount) {
        this.stock += amount;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) { this.productCode = productCode; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
}
