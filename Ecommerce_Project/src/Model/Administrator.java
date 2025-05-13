package Model;

public class Administrator extends Client {

	public Administrator(int id, String name, String lastName, String email, String password, String address,
			String phoneNumber, String gender) {
		super(id, name, lastName, email, password, address, phoneNumber, gender);

	}

	public void manageInventory() {
        System.out.println(name + " está gestionando el inventario.");
    }

    @Override
    public void displayRole() {
        System.out.println("Administrador: " + name);
    }

}
