package Model;

public class DigitalProduct extends Product {
	private String fileFormat;
    private double fileSizeMB;

	public DigitalProduct(int id, String productCode, String name, String description, int stock, double price,
			int categoryId, boolean isActive, String fileFormat, double fileSizeMB) {
		super(id, productCode, name, description, stock, price, categoryId, isActive);
		this.fileFormat = fileFormat;
        this.fileSizeMB = fileSizeMB;

	}
	
	public String getFileFormat() {return fileFormat; }
	public void setFileFormat(String fileFormat) {this.fileFormat = fileFormat; }
	
	public double getFileSizeMB() { return fileSizeMB; }
	public void setFileSizeMB(double fileSizeMB) {this.fileSizeMB = fileSizeMB; }
	
	@Override
    public void displayDetails() {
        System.out.println("Producto Digital: " + name);
        System.out.println("Formato: " + fileFormat);
        System.out.println("Tamaño: " + fileSizeMB + " MB");
        System.out.println("Precio: $" + price);
    }
	
}	
	