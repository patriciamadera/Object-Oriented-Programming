package Model;

public abstract class Client {
	private int id;
	private String name;
	private String lastName;
	private String email;
	private String password;
	private String address;
	private String phoneNumber;
	private String gender;
	private ShoppingCart cart;

    public Client(int id, String name, String lastName, String email, String password, String address, String phoneNumber, String gender) {
        setId(id);
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setAddress(address);
    	setPhoneNumber(phoneNumber);
        setGender(gender);
        this.cart = new ShoppingCart();
    }

    public void updateProfile(String email, String address, String phoneNumber) {
        setEmail(email);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public void addToCart(Product product) {
        if (product != null) {
            cart.addProduct(product);
            System.out.println("Producto agregado al carrito: " + product.getName());
        } else {
            System.out.println("El producto no es válido.");
        }
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    
    public abstract void displayRole();

}
