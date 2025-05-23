package Model;

public class DigitalProduct extends Product {
	private String fileFormat;
    private double fileSizeMB;

	public DigitalProduct(int id, String productCode, String name, String description, int stock, double price,
			int categoryId, boolean isActive, String fileFormat, double fileSizeMB) {
		super(id, productCode, name, description, stock, price, categoryId, isActive);
		setFileFormat(fileFormat);
        setFileSizeMB(fileSizeMB);

	}
	
	public String getFileFormat() {return fileFormat; }
	public void setFileFormat(String fileFormat) {
        if (fileFormat != null && !fileFormat.trim().isEmpty()) {
            this.fileFormat = fileFormat;
        } else {
            throw new IllegalArgumentException("El formato del archivo no puede estar vacío.");
        }
    }
	
	public double getFileSizeMB() { return fileSizeMB; }
	public void setFileSizeMB(double fileSizeMB) {
        if (fileSizeMB >= 0) {
            this.fileSizeMB = fileSizeMB;
        } else {
            throw new IllegalArgumentException("El tamaño del archivo no puede ser negativo.");
        }
    }
	
	@Override
    public void displayDetails() {
        System.out.println("Producto Digital: " + name);
        System.out.println("Formato: " + fileFormat);
        System.out.println("Tamaño: " + fileSizeMB + " MB");
        System.out.println("Precio: $" + price);
    }
	
}	
	