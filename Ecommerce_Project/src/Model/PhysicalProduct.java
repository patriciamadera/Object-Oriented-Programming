package Model;

public class PhysicalProduct extends Product {
	private double weight;
    private String dimensions;

	public PhysicalProduct(int id, String productCode, String name, String description, int stock, double price,
			int categoryId, boolean isActive, double weight, String dimensions) {
		super(id, productCode, name, description, stock, price, categoryId, isActive);
		setWeight(weight);
		setDimensions(dimensions);
	}
	
	public double getWeight() { return weight; }
	public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("El peso no puede ser negativo.");
        }
    }

    public String getDimensions() { return dimensions; }
    public void setDimensions(String dimensions) {
        if (dimensions != null && !dimensions.trim().isEmpty()) {
            this.dimensions = dimensions;
        } else {
            throw new IllegalArgumentException("Las dimensiones no pueden estar vacías.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Producto Físico: " + name);
        System.out.println("Peso: " + weight + " kg");
        System.out.println("Dimensiones: " + dimensions);
        System.out.println("Precio: $" + price);
    }

}
