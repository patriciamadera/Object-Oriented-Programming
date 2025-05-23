package Model;

public abstract class Product {
	private int id;
	private String productCode;
	private String name;
	private String description;
	private int stock;
	private double price;
	private int categoryId;
	private boolean isActive;

    public Product(int id, String productCode, String name, String description, int stock, double price, int categoryId, boolean isActive) {
    	setId(id);
        setProductCode(productCode);
        setName(name);
        setDescription(description);
        setStock(stock);
        setPrice(price);
        setCategoryId(categoryId);
        setActive(isActive);
    }

    public void updateStock(int amount) {
        if (this.stock + amount >= 0) {
            this.stock += amount;
        } else {
            throw new IllegalArgumentException("Stock no puede ser negativo.");
        }
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) {
        if (id > 0) this.id = id;
        else throw new IllegalArgumentException("ID debe ser mayor que 0.");
    }

    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) {
        if (productCode != null && !productCode.trim().isEmpty()) this.productCode = productCode;
        else throw new IllegalArgumentException("Código de producto no puede estar vacío.");
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) this.name = name;
        else throw new IllegalArgumentException("Nombre no puede estar vacío.");
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = (description != null) ? description : "";
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else throw new IllegalArgumentException("Stock no puede ser negativo.");
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
        else throw new IllegalArgumentException("Precio no puede ser negativo.");
    }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) {
        if (categoryId > 0) this.categoryId = categoryId;
        else throw new IllegalArgumentException("ID de categoría inválido.");
    }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }
    
    public abstract void displayDetails();
}
