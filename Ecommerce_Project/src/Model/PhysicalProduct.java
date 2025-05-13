package Model;

public class PhysicalProduct extends Product {
	private double weight;
    private String dimensions;

	public PhysicalProduct(int id, String productCode, String name, String description, int stock, double price,
			int categoryId, boolean isActive, double weight, String dimensions) {
		super(id, productCode, name, description, stock, price, categoryId, isActive);
		this.weight = weight;
        this.dimensions = dimensions;
	}
	
	public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getDimensions() { return dimensions; }
    public void setDimensions(String dimensions) { this.dimensions = dimensions; }

    @Override
    public void displayDetails() {
        System.out.println("Producto Físico: " + name);
        System.out.println("Peso: " + weight + " kg");
        System.out.println("Dimensiones: " + dimensions);
        System.out.println("Precio: $" + price);
    }

}
