package Model;

import java.util.ArrayList;
import java.util.List;

public class RegularClient extends Client {
	private List<String> purchaseHistory;

	public RegularClient(int id, String name, String lastName, String email, String password, String address,
			String phoneNumber, String gender) {
		super(id, name, lastName, email, password, address, phoneNumber, gender);
		this.purchaseHistory = new ArrayList<>();
	}
	
	public void addPurchase(String productId) {
        purchaseHistory.add(productId);
    }

    public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    @Override
    public void displayRole() {
        System.out.println("Cliente regular: " + name);
    }

}
