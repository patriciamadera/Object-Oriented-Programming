package Model;

public abstract class Client {
	protected int id;
	protected String name;
	protected String lastName;
	protected String email;
	protected String password;
	protected String address;
	protected String phoneNumber;
	protected String gender;

    public Client(int id, String name, String lastName, String email, String password, String address, String phoneNumber, String gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void updateProfile(String email, String address, String phoneNumber) {
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void addToCart(Product product) {
        System.out.println("Producto agregado al carrito: " + product.getName());
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
